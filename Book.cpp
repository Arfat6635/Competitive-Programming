#include <bits/stdc++.h>
using namespace std;

#define int long long int
#define ll long long
#define vi vector<int>
#define vvi vector<vector<int> >
#define vpi vector<pair<int, int> >
#define vvpi vector<vector<pair<int, int> > >
#define all(v) (v).begin(), (v).end()   
#define rall(v) (v).rbegin(), (v).rend()
#define pii pair<int, int>
#define pb push_back
#define SZ(x) (int)(x).size()
#define F first
#define S second
#define PI 3.1415926535897932384626
#define out cout << fixed << setprecision(12)
#define fast ios::sync_with_stdio(false); cin.tie(0);
#define inf 1e12

const int N = 1e6 + 10;
const int mod = 1e9 + 7;
const double pi = acos(-1);

vi a;
int n, k;

bool check(int mid) {
    int cnt = 1;
    int temp = 0;
    for(int i = 0; i < n; ++i) {
        if(temp + a[i] > mid) {
            cnt++;
            if(cnt > k) 
                return 0;
            temp = a[i];
        }
        else
            temp += a[i];
    }
    return 1;
}

void go() {
    cin >> n >> k;
    a = vi(n);
    int mn = inf, mx = 0;
    for(int i = 0; i < n; ++i){
        cin >> a[i];
        mn = min(mn, a[i]);
        mx += a[i];
    }
    int l = mn, r = mx;
    int ans = r;
    while(l <= r) {
        int mid = (l + r) / 2;
        if(check(mid)) {
            ans = min(ans, mid);
            r = mid - 1;
        }
        else {
            l = mid + 1;
        }
    }
    vi store;
    int temp = 0;
    int cnt = 0;
    for(int i = n - 1; i >= 0; --i) {
        if(temp + a[i] > ans) {
            store.pb(-1);
            cnt++;
            temp = a[i];
            store.pb(a[i]);
        }
        else {
            store.pb(a[i]);
            temp += a[i];
        }
    }
    reverse(all(store));
    if(cnt > k - 1) {
        for(int i = SZ(store) - 1; i >= 0; --i) {
            if(store[i] == -1) {
                store[i] = 0;
                cnt--;
                if(cnt == k - 1)
                    break;
            }
        }
    }
    for(int i = 0; i < SZ(store); ++i) {
        if(store[i]){
            if(store[i] != -1 && cnt < k - 1) {
                if(i + 1 < SZ(store) && store[i + 1] != -1) {
                    cout << store[i] << " / ";
                    cnt++;
                }
                else {
                    cout << store[i] << ' ';
                }
            }
            else if(store[i] != -1) {
                cout << store[i] << " ";
            }
            else if(i + 1 != SZ(store)) {
                cout << "/ ";
            }
        }
    }
    cout << "\n";
}
    
int32_t main(){
    ios::sync_with_stdio(false);
    cin.tie(0);

    go();
    return 0;
}