using Microsoft.VisualStudio.TestTools.UnitTesting;
using fourArithmeticOperations;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace fourArithmeticOperations.Tests
{
    [TestClass()]
    public class RandomFormulaTests
    {
        [TestMethod()]
        public void randFormulaTest()
        {
            RandomFormula formula = new RandomFormula();
            String result = formula.randFormula();
            Console.WriteLine(result);
        }
    }
}