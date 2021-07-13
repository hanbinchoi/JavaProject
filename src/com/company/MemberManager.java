package com.company;

import com.company.MemberDTO;

public interface MemberManager {
    static final String name = "a";
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
