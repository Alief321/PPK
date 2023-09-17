
package com.polstat.perpustakaan.service;

import com.polstat.perpustakaan.dto.MemberDto;
import com.polstat.perpustakaan.entity.Member;
import com.polstat.perpustakaan.mapper.MemberMapper;
import com.polstat.perpustakaan.repository.MemberRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    public MemberRepository memberRepository;
    
    @Override
    public MemberDto createMember(MemberDto memberDto) {
        Member member = memberRepository.save(MemberMapper.mapToMember(memberDto));
        return MemberMapper.mapToMemberDto(member);
    }

    @Override
    public MemberDto updateMember(MemberDto memberDto) {
        Member member = memberRepository.save(MemberMapper.mapToMember(memberDto));
        return MemberMapper.mapToMemberDto(member);
    }

    @Override
    public void deleteMember(MemberDto memberDto) {
        memberRepository.delete(MemberMapper.mapToMember(memberDto));
    }

    @Override
    public List<MemberDto> getMembers() {
        List<Member> members = (List<Member>) memberRepository.findAll();
        List<MemberDto> memberDtos = members.stream()
                .map((product) -> (MemberMapper.mapToMemberDto(product)))
                .collect(Collectors.toList());
        return memberDtos;
    }

    @Override
    public MemberDto getMember(Long id) {
        Member member = memberRepository.getReferenceById(id);
        return MemberMapper.mapToMemberDto(member);
    }
    
}
