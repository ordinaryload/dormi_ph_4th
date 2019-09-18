using System;
using System.Collections.Generic;
using System.Text;

namespace fourArithmeticOperations
{
   
    /*
     * 输出文件类
     * 将随机生成的四则混合运算存入文件中
     * 
     */
    class FormulaFile
    {
       
        public  void printFile(string result)
        {
            string path = @"F:\formula.txt";//定义路径
            System.IO.FileInfo fileInfo = new System.IO.FileInfo(path);
            System.IO.StreamWriter streamWriter = fileInfo.AppendText();//字符输出流
            streamWriter.WriteLine(result);
            streamWriter.Close();
        }
    }
}
