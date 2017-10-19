package com.company;

public class Time {
        long hour, minute, second;

        Time() {
            setTime(System.currentTimeMillis());
        }


        Time(long ms) {
            long totalSeconds = ms / 1000;
            long totalMinutes = totalSeconds / 60;
            this.hour = totalMinutes / 60;
            this.minute = totalMinutes % 60;
            this.second = totalSeconds % 60;

        }

        Time(int h, int m, int s) {
            this.hour = h;
            this.minute = m;
            this.second = s;
        }

        long getHour() {
            return this.hour;
        }

        long getMinute() {
            return this.minute;
        }

        long getSecond() {
            return this.second;
        }

        void setTime(long elapsedTime) {
            long totalSeconds = elapsedTime / 1000;
            long totalMinutes = totalSeconds / 60;
            this.hour = totalMinutes / 60;
            this.minute = totalMinutes % 60;
            this.second = totalSeconds % 60;
        }
    } // end of Time class

