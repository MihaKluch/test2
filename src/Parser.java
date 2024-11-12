public class Parser {

   static Calc calc = new Calc();
   static String pop = calc.userInput;
    static String  userOtput(String hh) {
//        создаем массив и разбиваем строку на подстроки по пробелу
        String[] arrRazbit = hh.split(" ");
String str1 = arrRazbit[0];
String str2 = arrRazbit[1];
String str3 = arrRazbit[2];
//убираем кавычки разными способами
str3 = str3.replace("\"","");

//        return hh.toString();
        return str2;
    }
};



