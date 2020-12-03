package day1

class Day1 {
    companion object {
        const val SUM = 2020
    }

    fun execute() {
        println("DAY 1")
        test1()
        test2()
    }

    private fun test1() {
        val list = getDayOneInput()
        var valToFind = 0

        list.forEach {
            valToFind = SUM - it
            if (list.contains(valToFind)) {
                println("val1 =$it val2 =$valToFind output = ${it * valToFind}")
                return
            }
        }
    }

    private fun test2() {
        val list = getDayOneInput()
        val sortedList = list.sorted().reversed()
        var valToFind = 0
        var val1 = 0
        var val2 = 0

        sortedList.forEach {
            if (it + sortedList[sortedList.indexOf(it) + 1] <= SUM) {
                val1 = it
                val2 = sortedList[sortedList.indexOf(it) + 1]
                valToFind = SUM - val1 - val2
                if (sortedList.contains(valToFind)) {
                    println("val1 =$it val2 =$val2 val3=$valToFind output = ${it * val2 * valToFind}")
                    return
                }
            }
        }
    }

    private fun getDayOneInput(): List<Int> {
        val inputs = "1036\n" +
                "1897\n" +
                "1256\n" +
                "1080\n" +
                "1909\n" +
                "1817\n" +
                "1759\n" +
                "1883\n" +
                "1088\n" +
                "1841\n" +
                "1780\n" +
                "1907\n" +
                "1874\n" +
                "1831\n" +
                "1932\n" +
                "1999\n" +
                "1989\n" +
                "1840\n" +
                "1973\n" +
                "1102\n" +
                "1906\n" +
                "1277\n" +
                "1089\n" +
                "1275\n" +
                "1228\n" +
                "1917\n" +
                "1075\n" +
                "1060\n" +
                "1964\n" +
                "1942\n" +
                "2001\n" +
                "1950\n" +
                "1181\n" +
                "1121\n" +
                "1854\n" +
                "1083\n" +
                "1772\n" +
                "1481\n" +
                "1976\n" +
                "1805\n" +
                "1594\n" +
                "1889\n" +
                "1726\n" +
                "1866\n" +
                "798\n" +
                "1739\n" +
                "1709\n" +
                "1946\n" +
                "1948\n" +
                "1808\n" +
                "1836\n" +
                "1849\n" +
                "1465\n" +
                "1066\n" +
                "1943\n" +
                "664\n" +
                "1894\n" +
                "1993\n" +
                "1061\n" +
                "1225\n" +
                "1589\n" +
                "1916\n" +
                "1885\n" +
                "1998\n" +
                "1470\n" +
                "1668\n" +
                "1666\n" +
                "1499\n" +
                "1437\n" +
                "1986\n" +
                "1127\n" +
                "1875\n" +
                "1132\n" +
                "1888\n" +
                "1877\n" +
                "1046\n" +
                "1982\n" +
                "1265\n" +
                "1757\n" +
                "1848\n" +
                "1786\n" +
                "1638\n" +
                "1958\n" +
                "1015\n" +
                "1013\n" +
                "1552\n" +
                "1742\n" +
                "1850\n" +
                "1016\n" +
                "1839\n" +
                "558\n" +
                "1826\n" +
                "1261\n" +
                "1988\n" +
                "1545\n" +
                "1078\n" +
                "1963\n" +
                "1967\n" +
                "1951\n" +
                "1086\n" +
                "1947\n" +
                "1880\n" +
                "1903\n" +
                "1994\n" +
                "1167\n" +
                "1736\n" +
                "1041\n" +
                "1652\n" +
                "1040\n" +
                "1033\n" +
                "1179\n" +
                "1844\n" +
                "1861\n" +
                "1488\n" +
                "1962\n" +
                "1135\n" +
                "1347\n" +
                "1187\n" +
                "1777\n" +
                "1598\n" +
                "1803\n" +
                "1147\n" +
                "1760\n" +
                "1926\n" +
                "1898\n" +
                "1923\n" +
                "1865\n" +
                "1313\n" +
                "1924\n" +
                "1023\n" +
                "1576\n" +
                "1715\n" +
                "1391\n" +
                "1346\n" +
                "1882\n" +
                "2000\n" +
                "1024\n" +
                "1143\n" +
                "1065\n" +
                "1560\n" +
                "1029\n" +
                "1119\n" +
                "1966\n" +
                "1022\n" +
                "1931\n" +
                "1512\n" +
                "1049\n" +
                "1929\n" +
                "1312\n" +
                "1069\n" +
                "1159\n" +
                "1053\n" +
                "1249\n" +
                "1074\n" +
                "1983\n" +
                "1761\n" +
                "1868\n" +
                "195\n" +
                "24\n" +
                "1331\n" +
                "1636\n" +
                "1020\n" +
                "1034\n" +
                "1671\n" +
                "708\n" +
                "1699\n" +
                "1900\n" +
                "1927\n" +
                "1829\n" +
                "301\n" +
                "1832\n" +
                "1042\n" +
                "1896\n" +
                "1928\n" +
                "1032\n" +
                "1992\n" +
                "2005\n" +
                "1955\n" +
                "1047\n" +
                "1068\n" +
                "1001\n" +
                "1052\n" +
                "1744\n" +
                "1845\n" +
                "1208\n" +
                "1018\n" +
                "1859\n" +
                "1342\n" +
                "1823\n" +
                "1758\n" +
                "2007\n" +
                "1241\n" +
                "1893\n" +
                "1876\n" +
                "1984\n" +
                "1655\n" +
                "1534\n" +
                "1150\n" +
                "1789\n" +
                "1870"

        return inputs.split("\n").map { it.toInt() }
    }
}