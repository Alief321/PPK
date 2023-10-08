package com.polstat.perpustakaan.repository;


import com.polstat.perpustakaan.entity.PeminjamanBuku;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "peminjamanBuku", path = "peminjamanBuku")
public interface PeminjamanBukuRepository extends PagingAndSortingRepository<PeminjamanBuku, Long>, CrudRepository<PeminjamanBuku, Long> {
    List<PeminjamanBuku> findByBookID(@Param("book_id") int bookID);
    List<PeminjamanBuku> findByMemberID(@Param("member_id") String memberID);
}
