package org.example.exam.exam1;

import org.example.TestUt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    @Test
    void testSize() {
        MyArrayList<String> list = new MyArrayList<>();
        assertThat(list.size()).isEqualTo(0);
    }

    @Test
    @DisplayName("add(\"사과\")")
    void t2() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");

        assertThat(list.size()).isEqualTo(2);

    }

    @Test
    @DisplayName("get(1)")
    void t3() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과"); // data[0];
        list.add("포도"); // data[1];

        assertThat(list.get(0)).isEqualTo("사과"); // data[0];
        assertThat(list.get(1)).isEqualTo("포도"); // data[1];
    }

    @Test
    @DisplayName("data(배열)의 크기가 자동으로 늘어나야 한다.")
    void t4() {
        MyArrayList<String> list = new MyArrayList<>();

        String[] data = TestUt.getFieldValue(list, "data", null);
        assertThat(data.length).isEqualTo(2);

        list.add("사과");
        list.add("포도");

        data = TestUt.getFieldValue(list, "data", null);
        assertThat(data.length).isEqualTo(2);
        list.add("당근");
        data = TestUt.getFieldValue(list, "data", null);
        assertThat(data.length).isEqualTo(4);

        assertThat(list.size()).isEqualTo(3);
    }

//    private MyArrayList<String> list;



//    @BeforeEach
//    void setUp() {
//        list = new MyArrayList<>();
//    }
//
//    @Test
//    void testAdd() {
//        assertTrue(list.add("Element1"));
//        assertEquals(1, list.size());
//        assertEquals("Element1", list.get(0));
//    }
//
//    @Test
//    void testRemove() {
//        list.add("Element1");
//        list.add("Element2");
//        list.add("Element3");
//        assertEquals("Element2", list.remove(1));
//        assertEquals(2, list.size());
//    }
//
//    @Test
//    void testGet() {
//        list.add("Element1");
//        list.add("Element2");
//        assertEquals("Element1", list.get(0));
//        assertEquals("Element2", list.get(1));
//    }
//
//    @Test
//    void testSize() {
//        list.add("Element1");
//        list.add("Element2");
//        list.add("Element3");
//        assertEquals(3, list.size());
//    }
//
//    @Test
//    void testContains() {
//        list.add("Element1");
//        list.add("Element2");
//        assertTrue(list.contains("Element1"));
//        assertFalse(list.contains("Element3"));
//    }
//
//    @Test
//    void testIndexOf() {
//        list.add("Element1");
//        list.add("Element2");
//        list.add("Element1");
//        assertEquals(0, list.indexOf("Element1"));
//        assertEquals(1, list.indexOf("Element2"));
//        assertEquals(-1, list.indexOf("Element3"));
//    }
//
//    @Test
//    void testClear() {
//        list.add("Element1");
//        list.add("Element2");
//        list.add("Element3");
//        list.clear();
//        assertEquals(0, list.size());
//        assertTrue(list.isEmpty());
//    }
}
