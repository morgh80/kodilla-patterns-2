package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book potop = new Book("Henryk Sienikiewicz", "Potop", 1897, "9188202");
        Book krzyzacy = new Book("Henryk Sienikiewicz", "Krzyżacy", 1904, "908223");
        Book quoVadis = new Book("Henryk Sienikiewicz", "Qou Vadis", 1912, "902851");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(potop);
        bookSet.add(krzyzacy);
        bookSet.add(quoVadis);
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int bookMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        Assert.assertEquals(1904,bookMedian);
    }
}
