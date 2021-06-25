package com.company;

import java.util.Objects;

public class MemberDTO {
    String name;
    public MemberDTO(String name) {
        this.name = name;
    }

    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj == null) return false;

        if(getClass() != obj.getClass()) return false;

        MemberDTO other = (MemberDTO) obj;

        if (name == null) {
            if(other.name != null) return false;
        } else if(!name.equals(other.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
