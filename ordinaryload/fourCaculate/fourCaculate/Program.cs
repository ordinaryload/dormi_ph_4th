using fourArithmeticOperations;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace fourCaculate
{
    class Program
    {
        private static int sumTotal;
        static void Main(string[] args)
        {
            Console.WriteLine("请输入需要出题的数目：");
            String sum = Console.ReadLine();//输入需要的题目数量
            sumTotal = Convert.ToInt32(sum);
            printFormula();
            Console.ReadKey();
        }
        public static void printFormula()
        {
            int makeCounts = 0;
            while (makeCounts < sumTotal)
            {
                FormulaFile formulaFile = new FormulaFile();
                RandomFormula randomFormula = new RandomFormula();
                String formula = randomFormula.randFormula();

                DataTable dataTable = new DataTable();
                object result = dataTable.Compute(formula, "");//将字符串转换为算术表达式计算
                String strResult = Convert.ToString(result);
                if (!(strResult.Contains(".") || strResult.Contains("-")))
                {
                    formulaFile.printFile(formula + " = ");//将算式写入文件
                    Console.WriteLine(formula + " = " + result);
                    makeCounts++;
                }


            }

        }
    }
}
