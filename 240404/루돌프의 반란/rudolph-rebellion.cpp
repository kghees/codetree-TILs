#include <iostream>
#include <algorithm>
#include <vector>
#include <cmath>
using namespace std;

int n, m, p, c, d;
int ry, rx;
int map[51][51] = { 0 };
int dy[4] = { -1,0,1,0 }; //0123 상우하좌
int dx[4] = { 0,1,0,-1 };
bool santa_live[31] = { false }; //산타가 살아 있는지
pair<int, int> santa_location[51]; //번호에 따른 산타 좌표 
int final_score[31];
int stun_santa[1004];

//연쇄충돌 확인 및 일반충돌 처리 
//c만큼 밀린 y,x좌표, 해당 방향으로 1밀리기 위한 y,x 현재 산타 번호
void crash(int cy, int cx, int my, int mx, int s_num) {
    //일반 충돌 이동
    if (map[cy][cx] == 0) {
        //충돌했는데 루돌프가 아니라면 있던 자리 0으로 초기화 해줘야함
        if (map[santa_location[s_num].first][santa_location[s_num].second] != -1) {
            map[santa_location[s_num].first][santa_location[s_num].second] = 0;
        }
        map[cy][cx] = s_num;
        santa_location[s_num] = { cy,cx };
        return;
    }
    //연쇄 충돌
    else {
        int tempidx = map[cy][cx]; //연쇄 충돌 전 산타 번호 값 저장해두기
        map[cy][cx] = s_num; //이전 산타는 맵에 넣어주기
        //충돌 전 산타 좌표 0으로 초기화
        if (map[santa_location[s_num].first][santa_location[s_num].second] != -1 || map[santa_location[s_num].first][santa_location[s_num].second] > 0) {
            map[santa_location[s_num].first][santa_location[s_num].second] = 0;
        }
        //충돌 후 산타 좌표 업데이트
        santa_location[s_num] = { cy,cx };
        //한칸 밀린 좌표 값 업데이트
        int newy = cy + my;
        int newx = cx + mx;
        //연쇄 충돌 한 산타가 범위가 넘어가면 죽이기
        if (newy > n || newy < 1 || newx > n || newx < 1) {
            santa_live[tempidx] = false;
            santa_location[tempidx] = { 0,0 };
            return;
        }
        
        else {
            //범위 만족하는데 또 옆에 있으면 재귀
            if (map[newy][newx] > 0) crash(newy, newx, my, mx, tempidx);
            //범위 만족하고 없으면 한칸 밀어주고 끝
            else {
                map[newy][newx] = tempidx;
                santa_location[tempidx] = { newy,newx };
            }
        }
    }
    return;
}


//루돌프의 움직임
//루돌프 이동, 산타와 충돌하면 산타 밀어주고 루돌프의 힘에 해당하는 점수 해당 산타에 더해주기
//연쇄적으로 충돌하는 경우도 생각
void move_dear(int y, int x, int turn) {
    int santa_num = 0; //가까운 산타 번호
    int mind = 1e9; //가까운 거리
    pair<int, int> same_distance; //가까운 산타 좌표 

    //가까운 거리 찾기(산타의 수 만큼)
    for (int i = 1; i <= p; i++) {
        //산타 죽었으면 continue
        if (!santa_live[i]) continue;
        //현재 루돌프와 산타[i]의 거리
        int nowd = pow((ry - santa_location[i].first), 2) + pow((rx - santa_location[i].second), 2);
        //비교해서 가까운 산타 찾아주기
        if (mind > nowd) {
            mind = nowd;
            same_distance = { santa_location[i].first,santa_location[i].second };
            santa_num = i;
        }
        //같으면 y좌표,x좌표 순으로 비교해서 산타 찾아주기 
        else if (mind == nowd) {
            if (same_distance.first == santa_location[i].first) {
                if (same_distance.second > santa_location[i].second) continue;
                else {
                    same_distance = { santa_location[i].first,santa_location[i].second };
                    santa_num = i;
                }
            }
            else if (same_distance.first > santa_location[i].first) continue;
            else {
                same_distance = { santa_location[i].first,santa_location[i].second };
                santa_num = i;
            }
        }
    }

    //가까운 산타 찾았으므로 루돌프 이동 시키기
    //루돌프 이동하면 이동하기 전 루돌프 위치 0으로 만들어주기 위함
    int tempry = ry, temprx = rx;
    int movey, movex;
    if (ry - same_distance.first < 0) movey = 1;
    else if (ry - same_distance.first > 0)movey = -1;
    else movey = 0;
    if (rx - same_distance.second < 0) movex = 1;
    else if (rx - same_distance.second > 0) movex = -1;
    else movex = 0;
    //루돌프 이동 및 이전 루돌프 위치 0
    ry += movey;
    rx += movex;
    map[ry][rx] = -1;
    map[tempry][temprx] = 0;

    //루돌프 이동 했는데 산타가 있을 경우
    if (same_distance.first == ry && same_distance.second == rx) {
        final_score[santa_num] += c; //해당하는 산타 번호에 c만큼 점수 더해주기
        int tempy = same_distance.first + movey * c;
        int tempx = same_distance.second + movex * c;
        //범위 넘어가면
        if (tempy > n || tempy < 1 || tempx > n || tempx < 1) {
            santa_live[santa_num] = false; //산타 탈락
            map[same_distance.first][same_distance.second] = 0; //탈락한 산타 위치 초기화
            santa_location[santa_num] = { 0,0 }; //탈락한 산타 위치 초기화
        }
        else {
            //연쇄충돌 및 일반충돌 처리
            //c만큼 밀린 y,x좌표, 해당 방향으로 1밀리기 위한 y,x 현재 산타 번호
            crash(tempy, tempx, movey, movex, santa_num);
            //스턴
            //산타 움직일때 turn+1보다 크면 다시 움직일 수 있음
            stun_santa[santa_num] = turn + 1;
        }
    }
    map[ry][rx] = -1;
}

//산타의 움직임
void move_santa(int turn) {
    for (int i = 1; i <= p; i++) {
        //산타 죽었거나 스턴 상태이면 continue
        if (!santa_live[i]) continue;
        if (stun_santa[i] >= turn) continue; 
        //i번째 산타 위치
        int tempsy = santa_location[i].first;
        int tempsx = santa_location[i].second;

        //산타 움직일 수 있는지와 4방향에 대해 최소 값 구하기
        int mindis = pow((tempsy - ry), 2) + pow((tempsx - rx), 2);
        int flag = -1;

        for (int k = 0; k < 4; k++) {
            int ny = tempsy + dy[k];
            int nx = tempsx + dx[k];
            //범위 넘어가거나 다른 산타가 있으면 continue
            if (ny > n || ny < 1 || nx > n || nx < 1 || map[ny][nx] > 0) continue;
            int dis = pow((ny - ry), 2) + pow((nx - rx), 2);
            //거리 최소 값 비교 
            if (mindis > dis) { //우선순위를 위해 등호는 빼주기
                mindis = dis;
                flag = k; //방향 넣어주기
            }
        }
        //움직일 수 있으면
        if (flag != -1) {
            //움직이기
            tempsy += dy[flag];
            tempsx += dx[flag];

            //움직였는데 루돌프와 충돌할 경우
            if (tempsy == ry && tempsx == rx) {
                final_score[i] += d; //스코어에 산타번호에 맞게 d만큼 더해주기
                //반대방향으로 d만큼 밀려나기
                int tempcy = tempsy + (-dy[flag] * d);
                int tempcx = tempsx + (-dx[flag] * d);
                map[santa_location[i].first][santa_location[i].second] = 0;
                //범위 넘어가면 죽이기
                if (tempcy > n || tempcy < 1 || tempcx > n || tempcx < 1) {
                    santa_live[i] = false;
                    map[santa_location[i].first][santa_location[i].second] = 0;
                    santa_location[i] = { 0,0 };
                }
                else {
                    crash(tempcy, tempcx, -dy[flag], -dx[flag], i);
                    stun_santa[i] = turn + 1;
                }
            }
            //충돌 X
            else {
                map[santa_location[i].first][santa_location[i].second] = 0;
                map[tempsy][tempsx] = i;
                santa_location[i] = { tempsy,tempsx };
            }
        }
    }
    //map[ry][rx] = -1;
}

int main() {
    cin >> n >> m >> p >> c >> d;
    cin >> ry >> rx;
    map[ry][rx] = -1;
    for (int i = 1; i <= p; i++) {
        int num, y, x;
        cin >> num >> y >> x;
        map[y][x] = num;
        santa_location[num] = { y,x };
        santa_live[num] = true;
    }
    int de = 1;
    for (int i = 1; i <= m; i++) {
        move_dear(ry, rx, i);
        move_santa(i);

        bool flag = false;
        int cnt = 0;
        //살아 남은 산타들 1점씩 추가
        //살아 남은 산타가 있는지 확인
        for (int i = 1; i <= p; i++) {
            if (santa_live[i]) {
                flag = true;
                final_score[i] += 1;
            }
        }
        //한명도 안살아있다면 게임 종료 
        if (!flag) break;
    }
    for (int i = 1; i <= p; i++) {
        cout << final_score[i] << " ";
    }
}