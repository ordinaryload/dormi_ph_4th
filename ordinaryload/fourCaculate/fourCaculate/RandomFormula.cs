using System;
using System.Text;

namespace fourArithmeticOperations
{
    /*
     * 生成公式类
     * 通过随机函数Random及其一些方法，来随机生成0-100数字，
     * 从而通过字符串的拼接得出公式
     */
    class RandomFormula
    {
        private static String[] Operation = { "+", "-", "*", "/" };//设置四则运算字符串数组，通过后面随机选取来匹配
        public String randFormula()
        {
            StringBuilder stringBuider = new StringBuilder();//为了便于操作字符串及一些性能，这里使用StringBuilder类
            long tick = DateTime.Now.Ticks;
            Random random = new Random((int)(tick & 0xffffffffL) | (int)(tick >> 32));
            int counts = (int)(random.NextDouble() * 2 + 2);//记录随机生成算式，运算符在 2 个 到 3 个之间。
            int start = 0;
            int[] number = new int[4];//定义一个数组来记录随机生成的数字
            number[0] = (int)(random.NextDouble() * 100) + 1;//随机生成0-100数字
            stringBuider.Append(number[0]);//将参数添加到stringBuider对象中
            start++;
            while (start <= counts)
            {
                int operation = (int)(random.NextDouble() * 4);
                number[start] = (int)(random.NextDouble() * 100) + 1;
                if (operation == 3)//若为除，进行判断操作
                {
                    while (!(number[start - 1] % number[start] == 0))
                    {
                        number[start] = (int)(random.NextDouble() * 100) + 1;
                    }
                    stringBuider.Append(Operation[operation]).Append(number[start]);
                }
                else
                {
                    stringBuider.Append(Operation[operation]).Append(number[start]);
                }

                start++;
            }
            return stringBuider.ToString();
        }
    }
}
