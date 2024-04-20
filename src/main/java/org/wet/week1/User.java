package org.wet.week1;


import lombok.*;

@AllArgsConstructor // 진짜 비즈니스라면, 이게 없는게 맞다.
public class User {

    private int cheatingCnt;
    private boolean isPermanentlyBanned;

    public void addCheatingCnt() {
        cheatingCnt++;
    }

    public boolean isPermanentlyBanned() {
        return isPermanentlyBanned;
    }

    // 열어둘 필요가 없다.
    public void setPermanentlyBanned(boolean permanentlyBanned) {
        isPermanentlyBanned = permanentlyBanned;
    }
}
