#include <iostream>
#include <vector>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t-- > 0) {   
        int n;
        cin >> n;
        vector<int> a(n);
        int min = INT_MAX;
        for (int i = 0; i < n; i++) {
            cin >> a[i];
            if (min > a[i])
                min = a[i];
        }

        if (a[0] == min)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }

    return 0;
}