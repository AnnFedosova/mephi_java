package lab4.task6;

/**
 * Suppose that in Section 4.2.2, “The equals Method,” on p. 140, the Item.equals method uses an instanceof test.
 * Implement DiscountedItem.equals so that it compares only the superclass if otherObject is an Item,
 * but also includes the discount if it is a DiscountedItem.
 * Show that this method preserves symmetry but fails to be transitive — that is,
 * find a combination of items and discounted items so that x.equals(y) and y.equals(z), but not x.equals(z).
 *
 * Допустим, что в методе Itern, equals(), представленном в разделе 4.2.2,
 * используется проверка с помощью операции instanceof.
 * Реализуйте метод Discountedltem.equals() таким образом, чтобы выполнять в нем сравнение только с суперклассом,
 * если его параметр otherObject относится к типу Item, но с учетом скидки, если эго тип Discountedltem.
 * Продемонстрируйте, что этот метод сохраняет симметричность, но не транзитивность, т.е.
 * способность обнаруживать сочетание товаров по обычной цене и со скидкой,
 * чтобы делать вызовы х.equals(у) и у.equals(z), но не х.equals(z).
 */

public class Main {
    public static void main(String[] args) {
        DiscountedItem discountedItem1 = new DiscountedItem("X",1,0);
        DiscountedItem discountedItem2 = new DiscountedItem("X",1,1);

        Item item = new Item("X",1);

        System.out.println(discountedItem1.equals(discountedItem2));
        System.out.println(discountedItem1.equals(item));
        System.out.println(discountedItem2.equals(item));
    }
}
