package day4

class Day4 {
    fun execute() {
        test1()
        test2()
    }

    private fun test1() {
        println("Day4 : ")
        println("test1")

        val passports = mutableListOf<Passport>()
        var count = 0
        getRawPasswords().forEach {
            passports.add(Passport(it))
        }
        passports.forEach {
            if (it.isComplete1())
                count++
        }
        println(count)
    }

    private fun test2() {
        println("Day4 : ")
        println("test2")
        val passports = mutableListOf<Passport>()
        var count = 0
        getRawPasswords().forEach {
            passports.add(Passport(it))
        }

        passports.forEach {
            it.assignConditions()
        }

        passports.forEach {
            if (it.isComplete2())
                count++
        }
        println(count)
    }

    private fun getRawPasswords(): List<String> {
        val rawInput = StringBuffer(
            "byr:1985\n" +
                    "eyr:2021 iyr:2011 hgt:175cm pid:163069444 hcl:#18171d\n" +
                    "\n" +
                    "eyr:2023\n" +
                    "hcl:#cfa07d ecl:blu hgt:169cm pid:494407412 byr:1936\n" +
                    "\n" +
                    "ecl:zzz\n" +
                    "eyr:2036 hgt:109 hcl:#623a2f iyr:1997 byr:2029\n" +
                    "cid:169 pid:170290956\n" +
                    "\n" +
                    "hcl:#18171d ecl:oth\n" +
                    "pid:266824158 hgt:168cm byr:1992 eyr:2021\n" +
                    "\n" +
                    "byr:1932 ecl:hzl pid:284313291 iyr:2017 hcl:#efcc98\n" +
                    "eyr:2024 hgt:184cm\n" +
                    "\n" +
                    "iyr:2017 pid:359621042\n" +
                    "cid:239 eyr:2025 ecl:blu byr:1986 hgt:188cm\n" +
                    "\n" +
                    "eyr:2027 hgt:185cm hcl:#373b34 pid:807766874 iyr:2015 byr:1955\n" +
                    "ecl:hzl\n" +
                    "\n" +
                    "iyr:2017 hcl:#7d3b0c hgt:174cm\n" +
                    "byr:1942 eyr:2025 ecl:blu pid:424955675\n" +
                    "\n" +
                    "eyr:2026 byr:1950 hcl:#ceb3a1\n" +
                    "hgt:182cm\n" +
                    "iyr:2016 pid:440353084 ecl:amb\n" +
                    "\n" +
                    "hcl:a4c546\n" +
                    "iyr:1932 pid:156cm eyr:2034 hgt:193 ecl:zzz byr:2025\n" +
                    "\n" +
                    "hcl:#ceb3a1 eyr:2020 pid:348696077 hgt:163cm\n" +
                    "ecl:hzl\n" +
                    "byr:1921 iyr:2016\n" +
                    "\n" +
                    "ecl:gmt eyr:2031 iyr:2018 byr:1971 hgt:152in pid:454492414\n" +
                    "hcl:z\n" +
                    "\n" +
                    "hcl:#341e13 byr:1921 iyr:2020\n" +
                    "pid:072379782 eyr:2022 hgt:166cm cid:253 ecl:brn\n" +
                    "\n" +
                    "ecl:blu hgt:75in byr:1954 eyr:2026 iyr:2012 hcl:#623a2f pid:328598886\n" +
                    "\n" +
                    "byr:2004 eyr:2035 hcl:#7d3b0c pid:359128744 iyr:2020 hgt:65cm\n" +
                    "ecl:#70f23f\n" +
                    "\n" +
                    "eyr:1988\n" +
                    "pid:171cm byr:2003\n" +
                    "iyr:1984\n" +
                    "cid:50\n" +
                    "hcl:z hgt:66cm ecl:#7a4c6e\n" +
                    "\n" +
                    "pid:9632440323 eyr:1964 hgt:63cm\n" +
                    "ecl:#fab0c5 hcl:z iyr:1945 byr:1986\n" +
                    "\n" +
                    "pid:936403762 ecl:#337357 byr:1997\n" +
                    "cid:196 iyr:2020\n" +
                    "eyr:2030 hgt:165cm\n" +
                    "hcl:#7d3b0c\n" +
                    "\n" +
                    "byr:1931 pid:488791624 hgt:169cm ecl:blu\n" +
                    "eyr:2029 hcl:#fffffd iyr:2013\n" +
                    "\n" +
                    "hcl:#733820 hgt:76in pid:517689823\n" +
                    "eyr:2028 byr:1988\n" +
                    "ecl:brn iyr:2016\n" +
                    "\n" +
                    "eyr:2023 hcl:#fffffd hgt:190cm iyr:2015 ecl:brn pid:739536900 byr:1951\n" +
                    "\n" +
                    "ecl:brn\n" +
                    "byr:1986 cid:262 hcl:#efcc98 pid:880203213 hgt:185cm iyr:2018 eyr:2029\n" +
                    "\n" +
                    "pid:181cm hgt:113 hcl:z ecl:#2c2d2c iyr:1961 byr:2021 eyr:2031\n" +
                    "\n" +
                    "hcl:#ceb3a1 iyr:2020\n" +
                    "byr:1977\n" +
                    "hgt:192cm\n" +
                    "pid:338237458 eyr:2030 ecl:amb\n" +
                    "\n" +
                    "iyr:1953 byr:2025 hgt:66cm eyr:1932\n" +
                    "pid:181cm\n" +
                    "ecl:#6f0b15 hcl:f79cb7\n" +
                    "cid:109\n" +
                    "\n" +
                    "hcl:#6b5442 pid:164cm ecl:blu\n" +
                    "hgt:176cm byr:2015\n" +
                    "iyr:2010 eyr:2029\n" +
                    "\n" +
                    "eyr:2035\n" +
                    "pid:085002665 ecl:#f88074 iyr:2018 hcl:#602927\n" +
                    "hgt:169cm\n" +
                    "\n" +
                    "byr:1958\n" +
                    "hcl:z\n" +
                    "pid:0468194841 iyr:2016 eyr:2007\n" +
                    "hgt:152cm\n" +
                    "ecl:#1c7a89 cid:124\n" +
                    "\n" +
                    "hcl:z pid:233430735 byr:2021 eyr:2026\n" +
                    "iyr:1953 ecl:#64769d hgt:184\n" +
                    "\n" +
                    "hgt:70cm pid:156397147\n" +
                    "iyr:2014 ecl:#d6ada0\n" +
                    "byr:2030\n" +
                    "hcl:#cfa07d\n" +
                    "\n" +
                    "ecl:amb\n" +
                    "byr:1990\n" +
                    "iyr:2017 hgt:164cm hcl:10f33a\n" +
                    "cid:293 eyr:2020 pid:332276985\n" +
                    "\n" +
                    "pid:163252726 eyr:2026\n" +
                    "hgt:163cm\n" +
                    "iyr:2011 hcl:#efcc98\n" +
                    "ecl:hzl byr:1936\n" +
                    "\n" +
                    "hgt:157cm iyr:2019 pid:078770050 hcl:#efcc98 byr:1967 eyr:2030\n" +
                    "ecl:gry cid:190\n" +
                    "\n" +
                    "hgt:184cm ecl:amb pid:851379559 hcl:#ceb3a1 byr:1946 eyr:2022\n" +
                    "iyr:2017 cid:280\n" +
                    "\n" +
                    "hgt:171cm byr:1942 pid:830156471 hcl:#cfa07d ecl:gry eyr:2032\n" +
                    "iyr:2022\n" +
                    "\n" +
                    "byr:2013 ecl:#67cbe8 eyr:2024\n" +
                    "pid:242908367\n" +
                    "hgt:76cm\n" +
                    "iyr:2025\n" +
                    "hcl:796bda\n" +
                    "\n" +
                    "ecl:amb iyr:2019\n" +
                    "byr:1945 eyr:2021 hcl:#602927 pid:550065206\n" +
                    "\n" +
                    "hgt:72in ecl:brn byr:1956 pid:253685193 iyr:2017 eyr:2023\n" +
                    "hcl:#6b5442\n" +
                    "\n" +
                    "eyr:2032 iyr:2019\n" +
                    "hgt:176cm\n" +
                    "ecl:oth pid:800237895 hcl:#888785 byr:1979\n" +
                    "\n" +
                    "eyr:2026 iyr:2020 cid:226 pid:882830512\n" +
                    "hcl:#866857 byr:1929 ecl:amb\n" +
                    "hgt:60in\n" +
                    "\n" +
                    "hcl:#cfa07d ecl:oth\n" +
                    "iyr:2015 pid:807837948 byr:1966 eyr:2030 hgt:191in\n" +
                    "\n" +
                    "byr:1969 iyr:2012 eyr:2024\n" +
                    "cid:244 ecl:hzl hcl:#18171d pid:344160556\n" +
                    "\n" +
                    "eyr:2020 pid:718422803\n" +
                    "hcl:#18171d\n" +
                    "hgt:181cm\n" +
                    "byr:1925 ecl:amb\n" +
                    "iyr:2019\n" +
                    "\n" +
                    "byr:1943 pid:740807220 hgt:72in ecl:amb\n" +
                    "iyr:2013 eyr:2022\n" +
                    "hcl:#cfa07d\n" +
                    "\n" +
                    "hcl:#733820\n" +
                    "byr:1986 iyr:2016 hgt:184cm cid:333\n" +
                    "pid:768188726 ecl:oth eyr:2030\n" +
                    "\n" +
                    "eyr:2022 byr:1996 hcl:#341e13 ecl:hzl iyr:2015 hgt:160cm\n" +
                    "pid:516401532\n" +
                    "\n" +
                    "hgt:182cm ecl:grn pid:336742028 iyr:2014 hcl:#34f021 byr:1967\n" +
                    "eyr:2029\n" +
                    "\n" +
                    "byr:2030\n" +
                    "hgt:142 iyr:2029 eyr:2040 hcl:426fc5\n" +
                    "cid:312\n" +
                    "pid:169cm\n" +
                    "ecl:#069ff7\n" +
                    "\n" +
                    "hgt:169cm ecl:gry hcl:#6b5442 iyr:2012 byr:1949 pid:131835020 eyr:2022\n" +
                    "\n" +
                    "hgt:70cm iyr:2012\n" +
                    "eyr:2037\n" +
                    "hcl:64fd76\n" +
                    "cid:175 pid:4880649770 ecl:grn byr:2029\n" +
                    "\n" +
                    "iyr:2013 hcl:#7d3b0c eyr:2024 hgt:190cm pid:659772377 cid:226 ecl:oth byr:1958\n" +
                    "\n" +
                    "ecl:lzr hgt:163cm pid:013605217\n" +
                    "byr:2000\n" +
                    "eyr:2020\n" +
                    "hcl:z iyr:2024\n" +
                    "\n" +
                    "cid:131 pid:896076106\n" +
                    "hcl:#c0946f byr:1930\n" +
                    "hgt:162cm eyr:2023 ecl:oth iyr:2017\n" +
                    "\n" +
                    "byr:1935 iyr:2012\n" +
                    "pid:942509879\n" +
                    "ecl:amb\n" +
                    "hgt:185cm cid:152 eyr:2024 hcl:#866857\n" +
                    "\n" +
                    "ecl:#e490a3 hcl:4813a2 hgt:176cm pid:778369210 iyr:2020\n" +
                    "eyr:2035 byr:2020\n" +
                    "\n" +
                    "byr:2006 ecl:amb pid:148409219\n" +
                    "hgt:189cm\n" +
                    "eyr:2021 hcl:z iyr:2028\n" +
                    "\n" +
                    "hgt:188in hcl:#9ed525\n" +
                    "iyr:2018 ecl:grn eyr:2021\n" +
                    "pid:065515632 byr:2012\n" +
                    "\n" +
                    "cid:109 hgt:167cm\n" +
                    "pid:545112664 ecl:grn hcl:#a62fea eyr:2026\n" +
                    "iyr:2012\n" +
                    "byr:1921\n" +
                    "\n" +
                    "pid:174997024\n" +
                    "iyr:2012\n" +
                    "eyr:2030\n" +
                    "ecl:grn\n" +
                    "hgt:150cm\n" +
                    "byr:1997\n" +
                    "hcl:#866857\n" +
                    "\n" +
                    "pid:451921339\n" +
                    "hgt:181cm\n" +
                    "hcl:#888785 iyr:2017 eyr:2026 byr:1936\n" +
                    "ecl:hzl\n" +
                    "\n" +
                    "hgt:187in\n" +
                    "hcl:#866857 ecl:grn pid:623919686 eyr:2028 iyr:2011\n" +
                    "byr:2016\n" +
                    "\n" +
                    "byr:2001\n" +
                    "ecl:gry eyr:2023 pid:324948416\n" +
                    "hcl:ef16f8 cid:139 hgt:184in iyr:2026\n" +
                    "\n" +
                    "byr:1954 hcl:#341e13 eyr:2023 pid:129321944 iyr:2012\n" +
                    "hgt:183cm\n" +
                    "ecl:amb\n" +
                    "\n" +
                    "hgt:164cm pid:596870080\n" +
                    "ecl:hzl eyr:2021 iyr:2017 hcl:#a97842\n" +
                    "byr:1951\n" +
                    "\n" +
                    "iyr:2013 byr:1944 hcl:#cfa07d\n" +
                    "hgt:168cm cid:72 pid:160531632\n" +
                    "ecl:grn\n" +
                    "\n" +
                    "iyr:2012 pid:900043442 hcl:#ceb3a1 cid:124 byr:1941\n" +
                    "ecl:blu hgt:156cm\n" +
                    "eyr:2025\n" +
                    "\n" +
                    "eyr:2021 hgt:61in iyr:2020 ecl:grn byr:1933\n" +
                    "\n" +
                    "byr:1971 cid:175\n" +
                    "eyr:2028 hcl:#efcc98 iyr:2013 hgt:170cm\n" +
                    "pid:225213589\n" +
                    "\n" +
                    "pid:147112660 hcl:#ceb3a1 eyr:2029 hgt:159cm ecl:grn iyr:2014\n" +
                    "byr:1967\n" +
                    "\n" +
                    "iyr:2015 pid:502975636 hgt:71in byr:1994\n" +
                    "hcl:#18171d ecl:amb eyr:2029\n" +
                    "\n" +
                    "byr:1948 hcl:#b6652a hgt:171in pid:181cm iyr:2019 ecl:grt cid:87\n" +
                    "\n" +
                    "pid:859849571 ecl:amb hcl:#6b5442\n" +
                    "hgt:193cm byr:1980\n" +
                    "iyr:2017\n" +
                    "eyr:2020\n" +
                    "\n" +
                    "cid:125 pid:508147848\n" +
                    "hcl:06ea75 iyr:1997 byr:2010 ecl:#c707f7 eyr:1970 hgt:161\n" +
                    "\n" +
                    "eyr:2020 cid:326 byr:1989 ecl:gry hgt:160cm hcl:#cc080c pid:319135853 iyr:2010\n" +
                    "\n" +
                    "ecl:utc\n" +
                    "pid:531595917 hgt:180cm byr:1987\n" +
                    "eyr:2024 hcl:#cfa07d iyr:2025\n" +
                    "\n" +
                    "ecl:gry byr:2007\n" +
                    "eyr:2028\n" +
                    "iyr:2025\n" +
                    "pid:6072964414 hgt:59cm hcl:#888785\n" +
                    "\n" +
                    "pid:791025828 ecl:hzl hgt:178cm\n" +
                    "iyr:2017\n" +
                    "hcl:#733820\n" +
                    "byr:1960 eyr:2021 cid:66\n" +
                    "\n" +
                    "byr:1991 iyr:1934\n" +
                    "cid:304 hgt:183cm ecl:grn\n" +
                    "pid:408294229\n" +
                    "eyr:2027 hcl:#623a2f\n" +
                    "\n" +
                    "ecl:blu hgt:181cm eyr:2024 iyr:2010\n" +
                    "pid:633234602 hcl:#2ce009\n" +
                    "byr:1985\n" +
                    "\n" +
                    "hcl:#c0946f hgt:192cm\n" +
                    "iyr:2012 pid:120684397 ecl:grn eyr:2027\n" +
                    "byr:1974\n" +
                    "\n" +
                    "eyr:2026\n" +
                    "pid:068304960 hgt:190cm byr:1925 iyr:2020 ecl:oth\n" +
                    "\n" +
                    "hcl:#733820\n" +
                    "hgt:168cm cid:307 iyr:2014 byr:1981 ecl:hzl pid:898831724 eyr:2026\n" +
                    "\n" +
                    "hgt:73cm\n" +
                    "eyr:2038\n" +
                    "byr:1980 ecl:gry iyr:2027 pid:678846912 hcl:z\n" +
                    "\n" +
                    "hgt:150cm cid:261 eyr:2021\n" +
                    "hcl:z pid:159cm iyr:2014 ecl:hzl\n" +
                    "byr:1955\n" +
                    "\n" +
                    "pid:#172650 ecl:gry eyr:2040 hcl:z iyr:2013 hgt:169cm byr:2008 cid:290\n" +
                    "\n" +
                    "iyr:2017 byr:1998\n" +
                    "hcl:#ceb3a1 pid:274178898 eyr:2027 ecl:brn\n" +
                    "hgt:183cm\n" +
                    "\n" +
                    "eyr:2024 cid:183 ecl:grn\n" +
                    "byr:1946\n" +
                    "hgt:63in hcl:#6b5442 iyr:2017\n" +
                    "\n" +
                    "hgt:97 byr:1990\n" +
                    "iyr:2019\n" +
                    "ecl:grn\n" +
                    "pid:587580330\n" +
                    "hcl:#341e13 eyr:2022\n" +
                    "\n" +
                    "ecl:oth\n" +
                    "pid:441517075 hcl:#c0946f iyr:2015 hgt:188cm eyr:2024 byr:1920\n" +
                    "\n" +
                    "hgt:191in pid:185cm iyr:1993\n" +
                    "hcl:93033d\n" +
                    "eyr:2034 ecl:dne\n" +
                    "\n" +
                    "pid:591478424 ecl:grn hcl:#888785\n" +
                    "byr:1929 eyr:2023 hgt:173cm iyr:2017\n" +
                    "\n" +
                    "iyr:1954\n" +
                    "hgt:63cm\n" +
                    "hcl:bdf2e0 ecl:amb pid:#912f46\n" +
                    "\n" +
                    "byr:1956 iyr:2012 hgt:73in pid:986643426\n" +
                    "ecl:blu\n" +
                    "cid:235 eyr:2025\n" +
                    "\n" +
                    "hcl:#cfa07d\n" +
                    "cid:320 byr:1930\n" +
                    "hgt:172cm\n" +
                    "ecl:oth eyr:2024 iyr:2019\n" +
                    "\n" +
                    "byr:1935 hgt:182cm pid:22794407 hcl:1b96fb eyr:1961 iyr:1941 ecl:#5e80cd cid:70\n" +
                    "\n" +
                    "iyr:2020 eyr:2021\n" +
                    "ecl:amb\n" +
                    "hgt:59in pid:594829025 hcl:#93092e\n" +
                    "byr:1976\n" +
                    "\n" +
                    "hcl:#a97842 eyr:2030\n" +
                    "byr:1937 iyr:2018 cid:295 ecl:oth\n" +
                    "hgt:166cm pid:282634012\n" +
                    "\n" +
                    "hgt:171cm hcl:#623a2f byr:1956\n" +
                    "pid:068178613 cid:214\n" +
                    "iyr:2012 eyr:2026 ecl:brn\n" +
                    "\n" +
                    "byr:1921\n" +
                    "hgt:161cm hcl:#888785\n" +
                    "ecl:brn pid:010348794\n" +
                    "eyr:2023 iyr:2011\n" +
                    "\n" +
                    "hcl:#a97842 iyr:2010\n" +
                    "byr:1955 eyr:2024\n" +
                    "pid:473791166\n" +
                    "ecl:brn\n" +
                    "hgt:175cm\n" +
                    "\n" +
                    "eyr:2028 ecl:grn pid:186196675 byr:1945 hgt:155cm cid:349\n" +
                    "iyr:2011 hcl:#6b5442\n" +
                    "\n" +
                    "hgt:161cm eyr:2030 cid:221\n" +
                    "pid:994494879 hcl:#733820 iyr:2012 ecl:blu\n" +
                    "byr:1957\n" +
                    "\n" +
                    "eyr:1993 iyr:2022 hcl:z byr:2020 pid:013428192 hgt:62cm\n" +
                    "ecl:dne\n" +
                    "\n" +
                    "hgt:178cm eyr:2029 hcl:#733820 byr:1962 iyr:2017 ecl:blu pid:567713232\n" +
                    "\n" +
                    "hcl:#fffffd\n" +
                    "byr:1928 pid:390162554\n" +
                    "eyr:2030 cid:79 hgt:150cm ecl:amb iyr:2019\n" +
                    "\n" +
                    "eyr:2030 cid:320 hgt:171cm hcl:#888785 pid:540720799 ecl:amb iyr:2012 byr:1979\n" +
                    "\n" +
                    "byr:1921\n" +
                    "ecl:oth pid:204986110 eyr:2023 hgt:154cm iyr:2017 hcl:#341e13 cid:126\n" +
                    "\n" +
                    "eyr:2020 cid:175 ecl:dne byr:1983 iyr:2016 hcl:#c0946f hgt:65cm\n" +
                    "\n" +
                    "hgt:191cm\n" +
                    "iyr:2010 cid:295 byr:1984 eyr:2025 hcl:#cfa07d pid:799775698\n" +
                    "ecl:amb\n" +
                    "\n" +
                    "iyr:2020 cid:278 hcl:#c0946f byr:1970 pid:773144393 eyr:2024 hgt:180cm\n" +
                    "\n" +
                    "hgt:176cm\n" +
                    "byr:1963\n" +
                    "pid:252396293 iyr:2012 ecl:brn hcl:#ceb3a1\n" +
                    "eyr:2030\n" +
                    "\n" +
                    "pid:545130492\n" +
                    "byr:2030 iyr:2020\n" +
                    "hgt:190cm eyr:2034 ecl:blu hcl:#fffffd\n" +
                    "\n" +
                    "hcl:#a97842 pid:032201787 hgt:190cm ecl:gry\n" +
                    "eyr:2028 iyr:2012 byr:1994\n" +
                    "\n" +
                    "hcl:#a97842 pid:064591809\n" +
                    "ecl:hzl byr:1927 hgt:165cm\n" +
                    "iyr:2011\n" +
                    "eyr:2028\n" +
                    "\n" +
                    "cid:77\n" +
                    "byr:2005\n" +
                    "hgt:125 iyr:1923 ecl:#605d73\n" +
                    "eyr:2022 pid:90184674 hcl:z\n" +
                    "\n" +
                    "cid:301 pid:106820988\n" +
                    "iyr:2018\n" +
                    "hcl:#cfa07d eyr:2029\n" +
                    "byr:1993\n" +
                    "hgt:193cm ecl:grn\n" +
                    "\n" +
                    "hcl:#623a2f\n" +
                    "cid:118\n" +
                    "ecl:oth pid:75827285\n" +
                    "hgt:189cm iyr:2010\n" +
                    "eyr:2030 byr:1976\n" +
                    "\n" +
                    "ecl:blu iyr:2023 eyr:1996\n" +
                    "hgt:66cm cid:251 byr:1972 hcl:z\n" +
                    "pid:557774244\n" +
                    "\n" +
                    "byr:2002\n" +
                    "hgt:169cm pid:629420566 eyr:2026 ecl:grn hcl:#341e13\n" +
                    "cid:166 iyr:2019\n" +
                    "\n" +
                    "iyr:2026 hcl:9b83a1 eyr:1979\n" +
                    "ecl:dne hgt:111 pid:176cm\n" +
                    "\n" +
                    "pid:#89718c byr:2026\n" +
                    "hcl:2ca5c7 hgt:142 eyr:2040\n" +
                    "ecl:lzr iyr:2029\n" +
                    "\n" +
                    "ecl:grn\n" +
                    "byr:2022 eyr:2020\n" +
                    "pid:7024869 hgt:123 iyr:2019 hcl:z\n" +
                    "\n" +
                    "hcl:#733820 hgt:155cm ecl:grn iyr:2020 byr:1955 eyr:2028\n" +
                    "pid:217362007\n" +
                    "\n" +
                    "hcl:#18171d ecl:gry\n" +
                    "byr:1971 hgt:193cm\n" +
                    "eyr:2020\n" +
                    "pid:352009857 iyr:2013\n" +
                    "\n" +
                    "byr:2018\n" +
                    "hgt:175in ecl:xry iyr:2015\n" +
                    "eyr:2036\n" +
                    "cid:171 pid:6132398 hcl:#efcc98\n" +
                    "\n" +
                    "pid:839955293\n" +
                    "byr:1928 hcl:#fffffd ecl:hzl iyr:2011\n" +
                    "hgt:162cm eyr:2023\n" +
                    "\n" +
                    "hgt:175cm pid:482827478 eyr:2028\n" +
                    "hcl:#6b5442 ecl:blu byr:1932 iyr:2010\n" +
                    "\n" +
                    "iyr:2020 hcl:#866857\n" +
                    "ecl:brn byr:1933 cid:269 pid:003931873 hgt:188cm\n" +
                    "eyr:2022\n" +
                    "\n" +
                    "byr:1981 hcl:#fffffd hgt:160cm cid:311 ecl:brn eyr:2025\n" +
                    "pid:930857758 iyr:2014\n" +
                    "\n" +
                    "hcl:#cfa07d hgt:73in\n" +
                    "ecl:gry\n" +
                    "pid:383281251\n" +
                    "iyr:2013 byr:1934 eyr:2026\n" +
                    "\n" +
                    "byr:1988 eyr:2026 pid:458002476\n" +
                    "iyr:2017\n" +
                    "hgt:175cm ecl:amb\n" +
                    "\n" +
                    "eyr:1987\n" +
                    "byr:2020 pid:299341304\n" +
                    "hcl:#341e13 iyr:1935 cid:125\n" +
                    "hgt:168cm\n" +
                    "ecl:gry\n" +
                    "\n" +
                    "iyr:2014 hcl:#b6652a pid:445799347\n" +
                    "hgt:188cm byr:1960\n" +
                    "eyr:2030 cid:290 ecl:amb\n" +
                    "\n" +
                    "eyr:2023\n" +
                    "hgt:75cm hcl:#733820 cid:195 byr:1933\n" +
                    "ecl:amb pid:062770586 iyr:2019\n" +
                    "\n" +
                    "hgt:168cm\n" +
                    "eyr:2021\n" +
                    "pid:725299968 ecl:grn byr:1932\n" +
                    "iyr:2016 hcl:#888785\n" +
                    "\n" +
                    "hgt:161cm hcl:#ceb3a1 byr:1962 eyr:2026 iyr:2013 ecl:amb pid:695426469 cid:227\n" +
                    "\n" +
                    "ecl:dne hcl:#ceb3a1 iyr:2013 eyr:2022\n" +
                    "pid:434786988 byr:1956 hgt:183cm\n" +
                    "\n" +
                    "pid:697500517\n" +
                    "byr:1968 hgt:169cm hcl:#fffffd ecl:grn cid:143\n" +
                    "iyr:2010\n" +
                    "eyr:2027\n" +
                    "\n" +
                    "byr:2029 ecl:amb hgt:175in iyr:2015 hcl:#ceb3a1\n" +
                    "pid:39839448\n" +
                    "eyr:2021 cid:105\n" +
                    "\n" +
                    "pid:0985607981 ecl:hzl iyr:2012\n" +
                    "eyr:2021 byr:2024 hcl:5cad22\n" +
                    "hgt:190cm\n" +
                    "\n" +
                    "hcl:#b6652a hgt:178cm cid:222 byr:1992 ecl:grn\n" +
                    "iyr:2011 pid:419544742\n" +
                    "\n" +
                    "iyr:2019 byr:1960 ecl:hzl eyr:2021 hgt:184cm cid:66 hcl:#866857 pid:412920622\n" +
                    "\n" +
                    "eyr:2025 hcl:#888785 iyr:2018 byr:1956 pid:698098389 ecl:grn hgt:173cm\n" +
                    "\n" +
                    "ecl:blu byr:1935\n" +
                    "pid:354892542 hgt:161cm\n" +
                    "iyr:2018\n" +
                    "eyr:2021 hcl:#b6652a\n" +
                    "\n" +
                    "ecl:oth cid:287 iyr:2028 byr:1953 eyr:2027 hcl:#7d3b0c hgt:151cm\n" +
                    "pid:211411839\n" +
                    "\n" +
                    "iyr:2018 byr:1934 hcl:#a97842\n" +
                    "pid:859748861\n" +
                    "ecl:oth hgt:175cm eyr:2025\n" +
                    "\n" +
                    "byr:1930 iyr:2018 eyr:2022\n" +
                    "hgt:175cm\n" +
                    "hcl:#292092\n" +
                    "ecl:brn pid:987163365\n" +
                    "\n" +
                    "hgt:167in hcl:#888785 eyr:2040 pid:4646402867 byr:2013 iyr:1941 ecl:#389aec\n" +
                    "\n" +
                    "ecl:hzl hcl:#602927\n" +
                    "hgt:168cm eyr:2026\n" +
                    "cid:235 iyr:2016\n" +
                    "byr:1942\n" +
                    "\n" +
                    "iyr:1975 pid:11337832 ecl:#a25273 hgt:151 byr:2017\n" +
                    "\n" +
                    "eyr:1979\n" +
                    "hgt:71cm\n" +
                    "byr:2003 hcl:7e7da7 pid:151cm ecl:#a8afb3 iyr:1937\n" +
                    "\n" +
                    "eyr:2021 hgt:74in hcl:#cfa07d iyr:2014 byr:1932\n" +
                    "pid:641867677 ecl:grn\n" +
                    "\n" +
                    "ecl:gry hgt:185cm pid:556229206 iyr:2013\n" +
                    "byr:1984\n" +
                    "hcl:#fffffd eyr:2028\n" +
                    "\n" +
                    "eyr:2020 byr:1989\n" +
                    "ecl:grn pid:618876158 hcl:z\n" +
                    "hgt:176cm iyr:2025\n" +
                    "\n" +
                    "eyr:2025 byr:2001 hcl:#cdb7f9\n" +
                    "pid:377402126 ecl:hzl hgt:184cm iyr:2019\n" +
                    "\n" +
                    "byr:1939 hgt:180cm eyr:2029 ecl:oth hcl:#733820 iyr:2016\n" +
                    "pid:733456875\n" +
                    "\n" +
                    "pid:883743276\n" +
                    "hcl:#7d3b0c eyr:2022 ecl:blu\n" +
                    "byr:1928 hgt:150cm cid:150 iyr:2013\n" +
                    "\n" +
                    "hgt:60cm ecl:#43f03d eyr:1994 byr:1975\n" +
                    "iyr:1980 pid:169cm\n" +
                    "\n" +
                    "hgt:104 byr:2029 eyr:2040 hcl:64a9b2\n" +
                    "pid:83898860\n" +
                    "iyr:1990\n" +
                    "ecl:#938bbe\n" +
                    "\n" +
                    "pid:284399238 ecl:gry hcl:#888785 iyr:2019 hgt:168cm byr:1944\n" +
                    "eyr:2022\n" +
                    "\n" +
                    "hcl:#733820 pid:486515752 ecl:grn hgt:188in byr:1941 iyr:2017 eyr:2005\n" +
                    "\n" +
                    "iyr:2010\n" +
                    "byr:1978 hgt:160cm eyr:2003\n" +
                    "ecl:oth\n" +
                    "hcl:#efcc98 pid:584668011\n" +
                    "\n" +
                    "byr:1944 ecl:gry pid:962700562 iyr:2011 hcl:#866857 eyr:2022\n" +
                    "hgt:191cm\n" +
                    "\n" +
                    "hcl:z pid:758583213 iyr:1941 ecl:gry eyr:2007\n" +
                    "hgt:67 byr:2022\n" +
                    "cid:215\n" +
                    "\n" +
                    "byr:1988\n" +
                    "ecl:#ae2a9b hcl:#fe9d14 iyr:2012\n" +
                    "pid:411550516 hgt:169cm eyr:2038\n" +
                    "\n" +
                    "pid:400034647 byr:1927 hgt:165cm\n" +
                    "iyr:2017 ecl:brn eyr:2024 cid:144 hcl:#341e13\n" +
                    "\n" +
                    "hcl:#733820 hgt:153cm eyr:2027\n" +
                    "byr:1935 pid:217121064 cid:120 iyr:2012 ecl:grn\n" +
                    "\n" +
                    "hgt:168cm hcl:#866857 iyr:2012 pid:1527348755\n" +
                    "byr:1946 eyr:2028 cid:184 ecl:amb\n" +
                    "\n" +
                    "hcl:#a97842\n" +
                    "byr:1967\n" +
                    "hgt:152cm eyr:2030\n" +
                    "ecl:blu\n" +
                    "pid:929661915 iyr:2018\n" +
                    "\n" +
                    "pid:671485026\n" +
                    "hgt:188cm byr:1974 iyr:2015 ecl:grn cid:268 eyr:2021 hcl:#c0946f\n" +
                    "\n" +
                    "pid:789877199 iyr:2011 cid:219 eyr:2029\n" +
                    "ecl:oth byr:1991\n" +
                    "hcl:#866857 hgt:154cm\n" +
                    "\n" +
                    "cid:137 pid:059579902\n" +
                    "eyr:2020 byr:1952\n" +
                    "hcl:#18171d iyr:2020\n" +
                    "hgt:172cm ecl:oth\n" +
                    "\n" +
                    "pid:182cm iyr:1997 byr:2012\n" +
                    "eyr:2034\n" +
                    "hgt:161in ecl:#528abf hcl:b7d2fe\n" +
                    "\n" +
                    "hgt:192cm ecl:oth iyr:2017 pid:264538307 byr:1994 cid:285\n" +
                    "hcl:#18171d eyr:2030\n" +
                    "\n" +
                    "hcl:#efcc98\n" +
                    "pid:38036608\n" +
                    "eyr:2010\n" +
                    "iyr:2026\n" +
                    "byr:2027\n" +
                    "cid:239 ecl:zzz hgt:74\n" +
                    "\n" +
                    "iyr:2012\n" +
                    "eyr:2022 hgt:178cm\n" +
                    "hcl:#888785\n" +
                    "ecl:hzl\n" +
                    "byr:1998 pid:000080585\n" +
                    "\n" +
                    "pid:719620152 hcl:#b6652a cid:133\n" +
                    "ecl:hzl\n" +
                    "byr:1983 iyr:2012 hgt:175cm\n" +
                    "eyr:2024\n" +
                    "\n" +
                    "cid:155 eyr:1977 iyr:2019 ecl:#28de8b byr:1941 hcl:#602927 hgt:173cm pid:493773064\n" +
                    "\n" +
                    "iyr:2010\n" +
                    "pid:842124616 ecl:hzl eyr:2025 cid:146 hcl:#733820 hgt:166cm byr:1987\n" +
                    "\n" +
                    "hcl:fd4dcf byr:2006 iyr:2011 pid:820797708 eyr:2020 hgt:189cm\n" +
                    "ecl:gry\n" +
                    "\n" +
                    "iyr:1971 pid:22107293 hcl:#5b3f01 cid:257\n" +
                    "ecl:hzl\n" +
                    "hgt:60cm eyr:2000 byr:1965\n" +
                    "\n" +
                    "byr:1932 eyr:2028\n" +
                    "hcl:#6b5442 ecl:amb pid:947149686\n" +
                    "iyr:2015 hgt:187cm\n" +
                    "\n" +
                    "hcl:#a97842\n" +
                    "cid:260\n" +
                    "hgt:167cm eyr:2027 byr:1973 ecl:oth pid:741678753 iyr:2016\n" +
                    "\n" +
                    "pid:334234443 ecl:gry hcl:#18171d eyr:2020\n" +
                    "iyr:2016 hgt:159cm byr:1926\n" +
                    "\n" +
                    "hgt:118 eyr:1929 iyr:2013\n" +
                    "pid:987139064\n" +
                    "cid:196\n" +
                    "hcl:#cfa07d ecl:#f72601 byr:1929\n" +
                    "\n" +
                    "byr:1924\n" +
                    "pid:623185744 iyr:2012 cid:341 hcl:#602927 hgt:192cm eyr:2022\n" +
                    "\n" +
                    "iyr:2012 byr:1971 hgt:168cm cid:146 pid:673038025 hcl:#866857 eyr:2020 ecl:hzl\n" +
                    "\n" +
                    "eyr:2023 iyr:2017\n" +
                    "pid:205596613 cid:298 hcl:#341e13\n" +
                    "hgt:169cm ecl:oth\n" +
                    "byr:1996\n" +
                    "\n" +
                    "ecl:blu pid:775831730\n" +
                    "eyr:2029 iyr:1924 hgt:168cm hcl:z\n" +
                    "\n" +
                    "byr:2023 hgt:181cm\n" +
                    "pid:4365105095 iyr:2021\n" +
                    "ecl:lzr eyr:2024 hcl:z\n" +
                    "\n" +
                    "hgt:184cm byr:1987 pid:175cm ecl:#83a5fa eyr:2023\n" +
                    "\n" +
                    "eyr:2021 pid:422371422 ecl:oth iyr:2015 hcl:#866857\n" +
                    "byr:1963 hgt:174cm\n" +
                    "\n" +
                    "pid:006970943\n" +
                    "hcl:#2f22ef iyr:2020\n" +
                    "ecl:gry\n" +
                    "byr:1922\n" +
                    "eyr:2024 hgt:163cm\n" +
                    "\n" +
                    "cid:160 byr:2015\n" +
                    "eyr:2038 hcl:z ecl:grt hgt:166 iyr:2026\n" +
                    "pid:#14978f\n" +
                    "\n" +
                    "hgt:178cm eyr:2021 iyr:2016 pid:471529794\n" +
                    "hcl:#b6652a cid:192\n" +
                    "ecl:grn byr:1970\n" +
                    "\n" +
                    "iyr:2015 ecl:brn hcl:#602927 hgt:187cm\n" +
                    "pid:729284172\n" +
                    "eyr:2024 byr:1932\n" +
                    "\n" +
                    "cid:153\n" +
                    "ecl:dne eyr:2005\n" +
                    "pid:178cm iyr:2028\n" +
                    "byr:2029 hgt:160in hcl:482a92\n" +
                    "\n" +
                    "byr:1995 iyr:2012 hcl:#866857 hgt:159cm\n" +
                    "eyr:1950 ecl:gry pid:183cm\n" +
                    "\n" +
                    "pid:875885919\n" +
                    "hgt:159cm\n" +
                    "iyr:2011\n" +
                    "ecl:gry byr:1988 hcl:#341e13 eyr:2028\n" +
                    "\n" +
                    "pid:2390267705 hcl:#7d3b0c byr:2009\n" +
                    "eyr:2017 ecl:grn hgt:183cm iyr:2015\n" +
                    "\n" +
                    "ecl:brn eyr:2029 hcl:#866857 iyr:2020 hgt:180cm byr:2001\n" +
                    "pid:668021168\n" +
                    "\n" +
                    "hcl:#c0946f\n" +
                    "eyr:2024 ecl:amb pid:013487714 byr:1965 hgt:172cm cid:320 iyr:2020\n" +
                    "\n" +
                    "eyr:2025 pid:115479767 hcl:#866857 ecl:oth\n" +
                    "hgt:163cm iyr:2010 byr:1999\n" +
                    "\n" +
                    "byr:1967 iyr:2011 cid:112 hcl:#733820\n" +
                    "eyr:2040 ecl:grt\n" +
                    "hgt:66 pid:804536366\n" +
                    "\n" +
                    "hgt:163 pid:1764836278 eyr:2035\n" +
                    "iyr:2021\n" +
                    "hcl:z ecl:#f1bb27\n" +
                    "\n" +
                    "hcl:#efcc98 hgt:176cm byr:1994 pid:590539278 ecl:grn iyr:2011 eyr:2021\n" +
                    "\n" +
                    "iyr:2017 eyr:2024 hgt:167cm hcl:#b62e29 pid:495674801\n" +
                    "byr:1970 ecl:brn\n" +
                    "\n" +
                    "hgt:168cm pid:993244641\n" +
                    "byr:1968\n" +
                    "eyr:1926\n" +
                    "hcl:#b6652a ecl:brn\n" +
                    "iyr:2023\n" +
                    "\n" +
                    "hgt:63in hcl:z pid:594070517\n" +
                    "eyr:2021 ecl:oth\n" +
                    "iyr:2017\n" +
                    "byr:2000\n" +
                    "\n" +
                    "eyr:2030 pid:272955042 cid:319 iyr:2011 ecl:amb byr:1999 hcl:#888785 hgt:158cm\n" +
                    "\n" +
                    "eyr:2025\n" +
                    "pid:814305816 byr:1945 ecl:brn hgt:162cm iyr:2018\n" +
                    "hcl:#a97842\n" +
                    "cid:229\n" +
                    "\n" +
                    "byr:1996 eyr:2026 pid:582584802 hcl:#c0946f iyr:2020 ecl:grn\n" +
                    "hgt:162cm\n" +
                    "\n" +
                    "eyr:2027\n" +
                    "hgt:155cm byr:1925\n" +
                    "hcl:#888785\n" +
                    "cid:182\n" +
                    "iyr:2014 ecl:brn\n" +
                    "pid:250884352\n" +
                    "\n" +
                    "hgt:173cm cid:135\n" +
                    "iyr:2017 pid:661330507 byr:1950 eyr:2020 ecl:gry hcl:#18171d\n" +
                    "\n" +
                    "pid:208932950\n" +
                    "eyr:2030 hgt:179cm\n" +
                    "iyr:2013\n" +
                    "ecl:oth\n" +
                    "byr:1981\n" +
                    "cid:58 hcl:#6b5442\n" +
                    "\n" +
                    "hcl:#f183e7 iyr:2014\n" +
                    "hgt:159cm pid:614579850 ecl:gry eyr:2029\n" +
                    "cid:186 byr:1962\n" +
                    "\n" +
                    "eyr:2027 hcl:#db3405 byr:1938 pid:194516631 cid:167 hgt:177cm ecl:oth\n" +
                    "\n" +
                    "hgt:68in hcl:#733820 pid:228644594 eyr:2030 ecl:gry iyr:2010 cid:334 byr:1951\n" +
                    "\n" +
                    "iyr:2017 hcl:#341e13\n" +
                    "pid:#6a28c9 hgt:154cm ecl:gry\n" +
                    "byr:1966 eyr:2023\n" +
                    "\n" +
                    "pid:250155574 cid:84\n" +
                    "hgt:157cm ecl:grn byr:1937 iyr:2017 eyr:2024 hcl:#b6652a\n" +
                    "\n" +
                    "pid:831823039 eyr:2028 iyr:2015 ecl:gry\n" +
                    "hgt:192cm cid:137 byr:1922\n" +
                    "hcl:#6b5442\n" +
                    "\n" +
                    "hgt:193cm byr:1941 eyr:2024 cid:56\n" +
                    "hcl:#623a2f ecl:amb\n" +
                    "pid:351293754 iyr:2016\n" +
                    "\n" +
                    "byr:1947 iyr:2012 ecl:hzl hcl:#602927 eyr:2028 pid:252010138 hgt:152cm\n" +
                    "\n" +
                    "hcl:#a97842 pid:801192586 ecl:hzl iyr:2018 hgt:193cm byr:1928 cid:323\n" +
                    "eyr:2028\n" +
                    "\n" +
                    "hgt:151cm\n" +
                    "pid:756347561 ecl:hzl\n" +
                    "eyr:2024 cid:161\n" +
                    "iyr:2016 hcl:#623a2f\n" +
                    "byr:2002\n" +
                    "\n" +
                    "pid:648012871 iyr:2015 ecl:blu\n" +
                    "eyr:2025 hcl:#623a2f byr:1973 hgt:177cm\n" +
                    "\n" +
                    "byr:1999 hcl:#ceb3a1 cid:345 eyr:2025 ecl:#b29a96 pid:093304949\n" +
                    "iyr:2017 hgt:93\n" +
                    "\n" +
                    "hcl:#b6652a\n" +
                    "iyr:2018 ecl:grn\n" +
                    "byr:1951 pid:077278028 eyr:2024 hgt:62in\n" +
                    "\n" +
                    "hgt:164cm pid:410770618 byr:1958\n" +
                    "iyr:2019\n" +
                    "eyr:2030\n" +
                    "ecl:gry hcl:#fffffd cid:293\n" +
                    "\n" +
                    "ecl:grt\n" +
                    "eyr:2039\n" +
                    "hcl:z pid:188cm byr:2022\n" +
                    "iyr:2027 hgt:76cm\n" +
                    "\n" +
                    "ecl:grn iyr:2012 hgt:150cm eyr:2024\n" +
                    "byr:1926 pid:954310029 cid:64\n" +
                    "hcl:#fffffd\n" +
                    "\n" +
                    "ecl:oth eyr:2027 pid:091152959 hgt:180cm hcl:#ceb3a1 iyr:2015 cid:350\n" +
                    "byr:1924\n" +
                    "\n" +
                    "iyr:2017 hcl:#49a793 eyr:2021 cid:144 byr:1966\n" +
                    "pid:717543257\n" +
                    "hgt:161cm\n" +
                    "ecl:hzl\n" +
                    "\n" +
                    "eyr:2025 ecl:brn hgt:60in pid:391973520 byr:1928 cid:77\n" +
                    "iyr:2012\n" +
                    "hcl:#602927\n" +
                    "\n" +
                    "iyr:2013 hgt:161cm pid:784483994 byr:1991\n" +
                    "hcl:#cfa07d\n" +
                    "eyr:2024 ecl:grn\n" +
                    "\n" +
                    "ecl:hzl iyr:1967 byr:2009 cid:265 hgt:180in pid:168cm\n" +
                    "eyr:1966\n" +
                    "\n" +
                    "eyr:2024 iyr:2019 pid:534453983\n" +
                    "byr:2028 ecl:oth hcl:#341e13 hgt:193cm\n" +
                    "\n" +
                    "eyr:2029 iyr:2010 hcl:#623a2f ecl:gry hgt:152cm pid:572128647\n" +
                    "byr:1996\n" +
                    "\n" +
                    "iyr:2014 byr:1981 cid:176\n" +
                    "ecl:grn hgt:183cm pid:974469723 eyr:2027\n" +
                    "\n" +
                    "eyr:2029 pid:233353682 byr:1968\n" +
                    "ecl:gry hgt:181cm iyr:2011\n" +
                    "hcl:#efcc98\n" +
                    "\n" +
                    "hgt:61 iyr:2005 cid:203 ecl:gmt pid:157cm hcl:z\n" +
                    "byr:2013\n" +
                    "\n" +
                    "iyr:2020\n" +
                    "byr:1923 ecl:blu eyr:2026 pid:069770502 hgt:69cm\n" +
                    "hcl:z\n" +
                    "\n" +
                    "byr:1997 hgt:160cm\n" +
                    "hcl:z iyr:2021 eyr:1920 pid:9374226872\n" +
                    "\n" +
                    "ecl:hzl eyr:2024 pid:537492791 hgt:186cm byr:1952\n" +
                    "hcl:#cfa07d\n" +
                    "iyr:2020\n" +
                    "\n" +
                    "hgt:73cm byr:1974\n" +
                    "ecl:xry iyr:2016 cid:133\n" +
                    "hcl:e741f5 pid:186cm\n" +
                    "\n" +
                    "pid:161cm\n" +
                    "byr:1950\n" +
                    "eyr:2028 ecl:hzl hcl:#7d3b0c\n" +
                    "iyr:2014 hgt:158cm\n" +
                    "\n" +
                    "ecl:#2c491e\n" +
                    "hcl:f8fe13 byr:2022\n" +
                    "hgt:137 iyr:1948\n" +
                    "eyr:2040 pid:#959a0f\n" +
                    "\n" +
                    "byr:1923 hgt:70in\n" +
                    "pid:904825661 hcl:#b6652a iyr:2010 eyr:2020\n" +
                    "ecl:oth\n" +
                    "\n" +
                    "iyr:2013\n" +
                    "ecl:blu pid:858020233 byr:1950 hgt:61in\n" +
                    "\n" +
                    "hcl:#18171d\n" +
                    "iyr:2016\n" +
                    "ecl:amb pid:613754206 byr:1975 hgt:164cm eyr:2025\n" +
                    "\n" +
                    "byr:1938\n" +
                    "iyr:2017 hcl:#623a2f cid:191 eyr:2027 hgt:174cm pid:287108745 ecl:amb\n" +
                    "\n" +
                    "iyr:2025 hcl:#623a2f byr:2019 hgt:170cm\n" +
                    "cid:233 pid:55323151 ecl:amb eyr:2037\n" +
                    "\n" +
                    "ecl:amb\n" +
                    "hgt:177cm hcl:#b6a3ce eyr:2025 byr:1967 pid:506927066\n" +
                    "iyr:2018 cid:93\n" +
                    "\n" +
                    "byr:1964 hgt:173cm eyr:2030 cid:106 pid:587635596 iyr:2012\n" +
                    "hcl:#fb5993\n" +
                    "ecl:hzl\n" +
                    "\n" +
                    "ecl:lzr pid:190cm hcl:44746d eyr:1955 hgt:66cm iyr:1990 byr:2003\n" +
                    "\n" +
                    "ecl:brn byr:1968 cid:216 hgt:181in hcl:#b6652a iyr:2016 eyr:2020 pid:0208311541\n" +
                    "\n" +
                    "ecl:hzl hgt:181cm\n" +
                    "eyr:1977 byr:2018 pid:527754216 hcl:#c0946f\n" +
                    "\n" +
                    "ecl:grn hcl:#efcc98\n" +
                    "byr:1935 eyr:2025 iyr:2018 hgt:65in pid:396444938 cid:293\n" +
                    "\n" +
                    "hgt:64in ecl:oth\n" +
                    "hcl:#18171d\n" +
                    "pid:105602506 byr:1973\n" +
                    "eyr:2022\n" +
                    "iyr:2014\n" +
                    "\n" +
                    "eyr:2039 hgt:64\n" +
                    "ecl:#ab45a8 byr:2009\n" +
                    "iyr:2025 pid:182cm hcl:d1614a cid:103"
        )

        return rawInput.split("\n\n")

    }
}

