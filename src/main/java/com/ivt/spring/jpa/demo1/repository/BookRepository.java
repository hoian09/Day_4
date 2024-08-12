package com.ivt.spring.jpa.demo1.repository;

import com.ivt.spring.jpa.demo1.entity.BookEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer> {
BookEntity findById(int bookID);
void deleteById(int id);
List<BookEntity> findByAuthor(String author);
List<BookEntity> findByAuthorAndPrice (String author, double price);
List<BookEntity> findByPriceOrNumberOfPage (double price, int numOfPage);
List<BookEntity> findByPriceLessThan (double price);
List<BookEntity> findByPriceGreaterThanEqual (double price);
List<BookEntity> findByNameContaining (String searchWords);
BookEntity findByIsbn (String isbn);
List<BookEntity> findByPublishDateAfter (LocalDate date);


@Query("select b from BookEntity b where b.name like ?1%") //?1 : param 1, ?2: param 2
    List<BookEntity> getBookNameStartWith (String name);
@Query (value = "select * from b where b.price <?1 and b.numberPage >=?2" , nativeQuery = true)
    List<BookEntity> getBookWherePriceLessThanAndNumOfPageGreaterThan (double price, int numOfPage);

}
