package hw_4;

public class HW_41 {
    public static void main(String[] args) {

        String task = " Case # ";
        String condition = "Condition";
        String rsp= "       ";
        String lsp= "       ";
        String sp = " ";
        String bsp = "  ";
        String eq = "  = ";
        String lbr = "( ";
        String rbr = " )";
        String and = " and ";
        char em = '!';

        int ff= 5;
        ff = 10;



        task(1);
        int numb = 1;
        cas(1);


        int a = 2;
        int b = 7;
        boolean d = (a ==a)&&(b==b);

        String  precon =lbr+a+eq+a+rbr+and+lbr+b +eq+b+rbr;
        String precon1 = precon;
        boolean d1 = d;
        System.out.println(d);
        String line = "____________________________";
        String ll = "| ";
//        String numb =
        String tab1= (line+"\n"
                +ll + rsp +sp+ task + numb + sp + lsp + ll  + rsp +sp + task + numb + sp + lsp + ll + "\n"
                + line + "\n"
                + ll + "\t\t" +sp + sp + condition +"\t\t"+ sp + sp + sp +ll +  ll + "\t\t" +sp + sp + condition +"\t\t"+ sp + sp + sp +ll+ "\n"
                + line +"\n"
                + ll+ precon + ll+ "\t\t" +bsp  + precon +"\t" + bsp+ sp +ll + "\n"
                + line + "\n"
                + ll +"\t"+rsp + bsp +d +bsp+sp + rsp+ll+ ll +"\t"+rsp + bsp +d +bsp+sp + rsp+ll+ "\n"
                + line );
        System.out.println(tab1);





        cas(2);

        line = "____________________________";
        numb++;


        a = 15;
        b = 3;
        precon =  "Не(15 < 3)";
        boolean e = (!(a<b));

        System.out.println(e);

        String precon2 = precon;
        Boolean d2 = e;

        String tab2= (line+"\n"
                +ll + rsp +sp + task + numb + sp + lsp + ll + "\n"
                + line + "\n"
                + ll + "\t\t" +sp + sp + condition +"\t\t"+ sp + sp + sp +ll+ "\n"
                + line +"\n"
                + ll+ "\t\t" +bsp  + precon +"\t" + bsp+ sp +ll + "\n"
                + line + "\n"
                + ll +"\t"+rsp + bsp +d +bsp+sp + rsp+ll+ "\n"
                + line );
        System.out.println(tab2);

        cas(3);
        line = "___________________________________";
        lsp= "       ";
        numb++;

        String  pine = "Сосна";
        String oak = "Дуб";
        String cherry = "Вишня";
        String maple = "Клен";

        precon = "(Сосна = Дуб) ИЛИ (Вишня = Клён)";

        e = (pine.equals(oak) || cherry.equals(maple));
        System.out.println(e);
        String tab3= (line+"\n"
                +ll  +"\t\t\t" + sp + task + numb +  "\t\t\t"+ sp+ sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t" + condition +"\t\t\t" + sp +  sp +ll+ "\n"
                + line +"\n"
                + ll + precon +ll + "\n"
                + line + "\n"
                + ll +"\t\t\t\t" + e + "\t\t\t" + sp + sp + ll+  "\n"
                + line );
        System.out.println(tab3);




        cas(4);
        numb++;
        precon = "Не(Сосна = Дуб)";
        e = (!(pine.equals(oak)));
        System.out.println(e);
        String tab4= (line+"\n"
                +ll  +"\t\t\t" + sp + task + numb +  "\t\t\t"+ sp+ sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t" + condition +"\t\t\t" + sp +  sp +ll+ "\n"
                + line +"\n"
                + ll + "\t\t\t" +precon + "\t\t" + sp + sp +  ll + "\n"
                + line + "\n"
                + ll +"\t\t\t\t" + e + "\t\t\t" + sp + sp + ll+  "\n"
                + line );

        System.out.println(tab4);




        cas(5);
        numb++;

        precon = " (Не(15 < 3)) И (10 > 20)";
        int c = 10;
        int k = 20;

        e = (!((a < b) && ( c > k )));
        System.out.println(e);
        String tab5= (line+"\n"
                +ll  +"\t\t\t" + sp + task + numb +  "\t\t\t"+ sp+ sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t"
                + condition +"\t\t\t" + sp +  sp +ll+ "\n"
                + line +"\n"
                + ll + "\t" +precon  + "\t" + sp + sp +  ll + "\n"
                + line + "\n"
                + ll +"\t\t\t\t" + e + "\t\t\t" + sp + sp + ll+  "\n"
                + line );


        System.out.println(tab5);


        cas(6);
        numb++;
         precon = "(Глаза даны, чтобы видеть)    |" + "\n"+"|(Под третьим этажом находится    |"+ "\n"+ "|второй этаж)";
        int z = 3;
        int w = 2;
        String con = "Глаза даны, чтобы видеть";
        String find = "Глаза даны, чтобы видеть";

        e = ((con.equals(find)&&(3>2)));
        System.out.println(e);

//        e = (!(a < b) && ( c > k ));
        String tab6= (line+"\n"
                +ll  +"\t\t\t" + sp + task + numb +  "\t\t\t"+ sp+ sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t" + condition +"\t\t\t" + sp +  sp +ll+ "\n"
                + line +"\n"
                + ll + "\t" +precon  + "\t\t\t\t\t" + sp + sp+ ll + "\n"
                + line + "\n"
                + ll +"\t\t\t\t" + e + "\t\t\t" + sp + sp + ll+  "\n"
                + line );
        System.out.println(tab6);

        cas(7);
        numb++;
        precon = "(6/2 = 3) ИЛИ (7*5 = 20)";
        a = 6;
        b = 2;
        c = 3;
        z = 7;
        w = 5;
        k = 20;
        e = ( a / b == 3)||( z * w == k);
        System.out.println(e);
        String tab7= (line+"\n"
                +ll  +"\t\t\t" + sp + task + numb +  "\t\t\t"+ sp+ sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t" + condition +"\t\t\t" + sp +  sp +ll+ "\n"
                + line +"\n"
                + ll + "\t" +precon  +"\t" + sp + sp+ ll + "\n"
                + line + "\n"
                + ll +"\t\t\t\t" + e + "\t\t\t" + sp + sp + ll+  "\n"
                + line );
        System.out.println(tab7);

        System.out.print(tab1 );
        System.out.print(tab2);

        System.out.println(line+"\n"
                +ll + rsp +sp+ task + numb + sp + lsp + ll + "\n"
                + line + "\n"
                + ll + "\t\t" +sp + sp + condition +"\t\t"+ sp + sp + sp +ll + "\n"
                + line +"\n"
                + ll+ precon +ll + "\n"
                + line + "\n"
                + ll +"\t"+rsp + bsp +d +bsp+sp + rsp+ll+ "\n"
                + line );






//        String line = "__________________________________________________________________________________________";
//        String lb = "| ";
//        String numb = cas();










    }

    public static void task (int aa){
        String lb = "<<<<<<<<<<<<<<<<<<<<<<<<<<<< ";
        String task = " Задача № ";
        String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.println(lb + task + aa +rb);



    }

    public static void cas (int nc){
        System.out.println("Case #  "+nc);
    }



}
