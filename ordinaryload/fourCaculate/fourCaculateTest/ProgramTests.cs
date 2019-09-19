using Microsoft.VisualStudio.TestTools.UnitTesting;
using fourCaculate;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace fourCaculate.Tests
{
    [TestClass()]
    public class ProgramTests
    {
        [TestMethod()]
        public void printFormulaTest()
        {
            Program.printFormula();
        }
    }
}