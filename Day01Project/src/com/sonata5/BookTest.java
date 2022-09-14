package com.sonata5;
import static org.junit.Assert.*;
import org.junit.Test;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

public class BookTest {
BookDAO b = new BookDAO();
@Test
public void testAdd() {
b.add(new Book(101,"Book 1",100));
b.add(new Book(102,"Book 2",200));
b.add(new Book(103,"Book 3",300));
b.add(new Book(104,"Book 4",400));
b.add(new Book(105,"Book 5",500));
int size = b.getSize();
System.out.println(size);
assertEquals(5, size);
      }
@Test
public void testdelete() {
b.add(new Book(101,"Book 1",100));
b.add(new Book(102,"Book 2",200));
b.add(new Book(103,"Book 3",300));
b.add(new Book(104,"Book 4",400));
b.add(new Book(105,"Book 5",500));
b.delete(1);
int size = b.getSize();
System.out.println(size);
assertEquals(4, size);
      }
}