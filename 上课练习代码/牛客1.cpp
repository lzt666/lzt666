#include <iostream>
#include <vector>
using namespace std;
/* ˼·
* ����������ģ������½��������������ֵݼ����������ֵ�����
* ��˴����½ǿ�ʼ���ң���Ҫ�������ֱ����½����ִ�ʱ������
* Ҫ�������ֱ����½�����Сʱ������
*/
class Solution {
public:
    bool Find(vector<vector<int> > array, int target)
    {
        /*��ά���������������*/
        int rowCount = array.size();
        int colCount = array[0].size();

        int i, j;//iָ���еı仯,jָ���еı仯

        //ѭ��
        for (i = rowCount - 1, j = 0; i >= 0 && j<colCount;)
        {
            if (target == array[i][j]){
                return true;
            }
            else if (target<array[i][j])
            {
                i--;
                continue;
            }
            else if(target>array[i][j])
            {
                j++;
                continue;
            }
        }
        return false;
    }
}; 
