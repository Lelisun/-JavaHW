package lesson1;

import java.util.EmptyStackException;
import java.util.Stack;

public class HW4 {

    //1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


//    public static void main(String[] args) {
//        int[] listMas = {5, 3, 2, 6, 7, 4, 9, 1};
//        LinkedList<Integer> linkList = new LinkedList<>();
//
//
//        for (Integer temp : listMas) {
//            linkList.add(temp);
//
//        }
//        System.out.println("\nЗадание 1.");
//        int temp = 0;
//        while (temp != linkList.size() - 1) {
//            linkList.add(linkList.size() - temp, linkList.getFirst());
//            linkList.removeFirst();
//            temp++;
//        }
//
//        System.out.println("Перевернутый = " + linkList);
//
//
//    }
//}


//  2. В шаблоне MyStack с урока реализовать методы

//public class HW4 {
//    private static LinkedList<String> queue;
//
//    public static void main(String[] args) {
//        System.out.println("\nЗадание2 MyStack.");
//        forPush("hello"); //добавить в конец
//        System.out.println(pop());//посмотреть первое в очереди
//        System.out.println(peek());//извлечь и вернуть первое в очереди
//    }
//    //
//    static void forPush(String st) {
//        Stack<String> stk = new Stack<>();
//        stk.push(st);
//        stk.push("beautiful");
//        stk.push("world");
//    System.out.println(stk);
//
//    }
//
//    private static Stack<String> pop() {
//        Stack<String> stk = new Stack<>();
//        stk.push("hello");
//        stk.push("beautiful");
//        stk.push("world");
//        System.out.println(stk.pop());
//        return stk;
//    }
//
//    private static Stack<String> peek() {
//        Stack<String> stk = new Stack<>();
//        stk.push("hello");
//        stk.push("beautiful");
//        stk.push("world");
//        System.out.println(stk.peek());
//        return stk;
//    }
//}

//3. В шаблоне MyQueue с урока реализовать методы

//public class HW4 {
//    private static LinkedList<String> queue;
////
//    public static void main(String[] args) {
//        System.out.println("\nЗадание3 MyQueue.");
//        forAdd("hello"); //добавить в конец
//        System.out.println(peek()); //посмотреть первое в очереди
//        System.out.println(pop()); //извлечь и вернуть первое в очереди
//
//    }
//    //
//    private static void forAdd(String str) {
//        Queue<String> arr = new ArrayDeque<String>();
//        arr.add(str);
//        arr.add("beautiful");
//        arr.add("world");
//        System.out.println(arr);
//
//
//        }
//
//    private static Queue<String> peek() {
//        Queue<String> arr = new ArrayDeque<String>();
//        arr.add("hello");
//        arr.add("beautiful");
//        arr.add("world");
//
//        System.out.println(arr.peek());
//        return arr;
//    }
//
//    private static Queue<String> pop() {
//        Queue<String> arr = new ArrayDeque<String>();
//        arr.add("hello");
//        arr.add("beautiful");
//        arr.add("world");
//
//        System.out.println(arr.poll());
//        return arr;
//    }
//}

//2. В шаблоне MyStack с урока реализовать методы
//
//    static void showpush(Stack st, String a) {
//        st.push(a);
//        System.out.println("Добавляем(" + a + ")");
//        System.out.println("Стек: " + st);
//    }
//
//    static void showpop(Stack st) {
//        System.out.print("Удаляем -> ");
//        String a = (String) st.pop();
//        System.out.println(a);
//        System.out.println("Стек: " + st);
//    }
//
//    static void showpeek(Stack st) {
//
//        String a = (String) st.peek();
//        System.out.println(a);
//        System.out.println("Стек: " + st);
//    }
//
//    public static void main(String args[]) {
//        System.out.println("\nЗадание2 MyStack.");
//        Stack st = new Stack();
//        System.out.println("Стек: " + st);
//        showpush(st, "hello");
//        showpush(st, "beautiful");
//        showpush(st, "world");
//
//        showpeek(st);
//
//        showpop(st);
//        showpop(st);
//        showpop(st);
//        try {
//            showpop(st);
//        } catch (EmptyStackException e) {
//            System.out.println("Пустой");
//        }
//    }
//
//}