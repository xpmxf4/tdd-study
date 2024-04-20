package org.wet.week1;


import lombok.*;

@AllArgsConstructor
public class User {

    private int cheatingCnt;
    private boolean isPermanentlyBanned;

    public void addCheatingCnt() {
        cheatingCnt++;
    }

    public void setPermanentlyBanned(boolean permanentlyBanned) {
        isPermanentlyBanned = permanentlyBanned;
    }
}
