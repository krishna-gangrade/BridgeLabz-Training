
package com.day7.fitnesstracker;

public class UserActivity {

    int userId;
    String userName;
    int dailySteps;

    public UserActivity(int userId, String userName, int dailySteps) {
        this.userId = userId;
        this.userName = userName;
        this.dailySteps = dailySteps;
    }

    public int getDailySteps() {
        return dailySteps;
    }

    @Override
    public String toString() {
        return "UserID: " + userId +
               ", Name: " + userName +
               ", Steps Today: " + dailySteps;
    }
}
