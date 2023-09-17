package com.polstat.perpustakaan.repository;

import com.polstat.perpustakaan.entity.Member;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
 List<Member> findByNameContainingIgnoreCase(String keyword);
 List<Member> findByMemberIDContainingIgnoreCase (String keyword);
 List<Member> findByAddressContainingIgnoreCase (String keyword);
 List<Member> findByNameContainingOrAddressContaining(String name, String address);
 
}
