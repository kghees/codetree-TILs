#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

struct run {
    int y, x, move;
    bool live;
};
vector<run> v;
int n, m, k;
int map[11][11];
int eny, enx;
int dy[4] = { -1,1,0,0 }; //상하좌우
int dx[4] = { 0,0,-1,1 };

//모든 참가자 이동
void all_move() {
    //참가자 수 만큼 이동 시켜야함
    for (int i = 1; i <= m; i++) {
        if (!v[i].live) continue; //나갔으면 이동X
        //4방향중 움직일 방향 정해주기
        int tempy = v[i].y;
        int tempx = v[i].x;
        int ly = v[i].y, lx = v[i].x;
        int mindis = abs(eny - tempy) + abs(enx - tempx);
        for (int l = 0; l < 4; l++) {
            int ny = tempy + dy[l];
            int nx = tempx + dx[l];
            if (ny > n || ny < 1 || nx > n || nx < 1 || map[ny][nx] > 0) continue;
            int tempdis = abs(eny - ny) + abs(enx - nx);
            if(mindis > tempdis){
                mindis = tempdis;
                ly = ny;
                lx = nx;
            }

        }
        if (mindis == 0) {
            v[i].move++;
            v[i].live = false;
            v[i].y = 0;
            v[i].x = 0;
            continue;
        }
        if (ly != tempy || lx != tempx) {
            v[i].move++;
            v[i].y = ly;
            v[i].x = lx;
        }
        
    }
}
//시계방향 90도 회전
void rotation(int d, int y, int x) {
    int save[11][11] = {0};
    bool check[11] = { false };
    int flag = 0;
    int save1[11][11] = { 0 };
    for (int i = y; i <= y + d; i++) {
        for (int j = x; j <= x + d; j++) {
            save[i - y][j - x] = map[i][j];
            map[i][j] = 0;
            //사람 좌표 옮겨주기
            for (int l = 1; l <= m; l++) {
                if (!v[l].live) continue;
                if (i == v[l].y && j == v[l].x && !check[l]) {
                    check[l] = true;
                    v[l].y = j - x + y;
                    v[l].x = d - i + y + x;
                }
            }
            if (!flag && i == eny && j == enx) {
                flag = 1;
                eny = j - x + y;
                enx = d - i + y + x;
            }
        }
    }
    for (int i = 0; i <= d; i++) {
        for (int j = 0; j <= d; j++) {
            if (save[i][j]) {
                save1[j][d - i] = save[i][j] - 1;
            }
        }
    }
    for (int i = 0; i <= d; i++) {
        for (int j = 0; j <= d; j++) {
            map[i + y][j + x] = save1[i][j];
        }
    }
    
}

//사각형 찾기
void square() {
    int mindis = 2000;
    int nowy = 100, nowx = 100;
    for (int i = 1; i <= m; i++) {
        if (!v[i].live) continue;
        int dis = max(abs(eny - v[i].y), abs(enx - v[i].x));
        int ny, nx;
        //큰거랑 같다면 그게 사각형 제일 왼쪽 위 좌표일 것임
        if (dis == abs(eny - v[i].y)) ny = min(eny, v[i].y);
        //큰 거중 거리를 뺏는데 1보다 작아지면 1이 왼쪽 위 좌표
        else {
            ny = max(eny, v[i].y) - dis;
            if (ny < 1) ny = 1;
        }
        if (dis == abs(enx - v[i].x)) nx = min(enx, v[i].x);
        else {
            nx = max(enx, v[i].x) - dis;
            if (nx < 1) nx = 1;
        }
        if (mindis > dis) {
            mindis = dis;
            nowy = ny,nowx = nx;
        }
        else if (mindis == dis) {
            if (nowy > ny) ny = nowy, nx = nowx;
            else if (nowy == ny) {
                if (nowx > nx) nowx = nx;
            }
        }
    }
    rotation(mindis, nowy, nowx);
}

int main() {
    cin >> n >> m >> k;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            cin >> map[i][j];
        }
    }
    //귀찮으니 0자리에 넣어주자
    v.push_back({ 0,0,0,true });
    for (int i = 1; i <= m; i++) {
        int a, b;
        cin >> a >> b;
        v.push_back({ a,b,0,true });
    }
    cin >> eny >> enx;
    map[eny][enx] = -10;
    int temp = 0;
    for (int i = 1; i <= k; i++) {
        all_move();
        //모든 참가자 나갔으면 더 이상 할 필요 X
        int cnt = 0;
        for (int j = 1; j <= m; j++) {
            if (!v[j].live)cnt++;
        }
        if (cnt == m) {
            temp = i;
            break;
        }
        square();
        int de = 1;
    }
    int res = 0;
    for (int i = 1; i <= m; i++) {
        res += v[i].move;
    }
    cout << res << '\n' << eny << " " << enx << '\n';
}