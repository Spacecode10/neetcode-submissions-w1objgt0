class Solution {
    public int countStudents(int[] students, int[] sand) {
        int o = 0;
        int z = 0;
        for(int i = 0; i < students.length; i++)
        {
            if(students[i] == 1)
            {
                o++;
            }
            else
            {
                z++;
            }
        }
        for(int i = 0; i < students.length; i++)
        {
            if(sand[i] == 1)
            {
                if(o == 0)
                {
                    return sand.length - i;
                }
                o--;
            }
            else
            {
                if(z == 0)
                {
                    return sand.length - i;
                }
                z--;
            }
        }
        return 0;
    }
}