public class Main {
    public static void main(String[] args) {
        Table table = new Table(10, 15);
        table.put("Марсель", 27);
        table.put("Даниил ", 20);
        table.put("Виктор ", 24);
        Table table1 = new Table(8, 10 );
        table1.put("a",1);
        table1.put("b",2);
        table1.put("c",3);


        //мы создали обьект внутреннего  класса,который привязан к обьекту table и имеет доступ к его состоянию
        Table.TablePrinter printer = table.new TablePrinter();
        //мы создали обьект внутреннего  класса,который привязан к обьекту table1 и имеет доступ к его состоянию
        Table.TablePrinter printer1 = table1.new TablePrinter();
      //  Table.TableEntry entry = new Table.TableEntry("Кто-то", 90);
        printer.print();
        printer1.print();
    }
}
