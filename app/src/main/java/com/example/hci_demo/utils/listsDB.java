package com.example.hci_demo.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class listsDB {

    public  List<Event> nextEventList = new ArrayList<>();
    public  List<Event> pastEventList = new ArrayList<>();


    public listsDB(){};

    public  List<Event> createNextEvents (){
        nextEventList.add(new Event(new Date(2023, 6, 15), "John and Emily's Wedding", "A joyous celebration of love and commitment."));
        nextEventList.add(new Event(new Date(2023, 7, 3), "Summer Beach Party", "An exciting beach party with music, games, and fun."));
        nextEventList.add(new Event(new Date(2023, 8, 10), "Community Block Party", "A neighborhood gathering with food, music, and entertainment."));
        nextEventList.add(new Event(new Date(2023, 9, 5), "Tech Startup Launch Party", "A celebration for the launch of a promising tech startup."));
        nextEventList.add(new Event(new Date(2023, 10, 12), "Java Developers Meetup", "A meetup for Java developers to network and share insights."));
        nextEventList.add(new Event(new Date(2023, 11, 20), "New Year's Eve Gala", "A glamorous evening of dining, dancing, and ringing in the new year."));
        nextEventList.add(new Event(new Date(2023, 12, 5), "Sweet 16 Birthday Bash", "A fabulous birthday party celebrating a milestone."));
        nextEventList.add(new Event(new Date(2024, 1, 8), "Engagement Celebration", "A joyful gathering to celebrate an engagement."));
        nextEventList.add(new Event(new Date(2024, 2, 16), "Retirement Party", "A heartfelt farewell event honoring a well-deserved retirement."));
        nextEventList.add(new Event(new Date(2024, 3, 1), "Graduation Ceremony", "A memorable ceremony celebrating academic achievements."));
        nextEventList.add(new Event(new Date(2024, 4, 22), "Family Reunion", "A reunion of family members for reconnecting and creating lasting memories."));
        nextEventList.add(new Event(new Date(2024, 5, 14), "Company Anniversary Celebration", "A special event commemorating a company's successful years."));
        nextEventList.add(new Event(new Date(2024, 6, 9), "Farewell Party", "A farewell gathering to bid goodbye and wish someone well."));
        nextEventList.add(new Event(new Date(2024, 7, 17), "Baby Shower", "A joyful celebration in anticipation of a new arrival."));
        nextEventList.add(new Event(new Date(2024, 8, 28), "Prom Night", "A magical evening of dancing and memories for high school students."));

        return nextEventList;
    }

    public List<Event> getNextEventList() {
        if (nextEventList == null) createNextEvents();
        return nextEventList;
    }

    public void setNextEventList(List<Event> nextEventList) {
        this.nextEventList = nextEventList;
    }

    public List<Event> getPastEventList() {
        if (pastEventList == null) createPastEvents();

        return pastEventList;
    }

    public void setPastEventList(List<Event> pastEventList) {
        this.pastEventList = pastEventList;
    }

    public  List <Event> createPastEvents(){
        pastEventList.add(new Event(new Date(2023, 3, 2), "Lior and Liora's Wedding", "A beautiful celebration of love and unity.", 5.0));
        pastEventList.add(new Event(new Date(2023, 4, 13), "Amir's Bar Mitzvah", "A meaningful coming-of-age ceremony.", 4.6));
        pastEventList.add(new Event(new Date(2022, 5, 25), "Yuval's Brit", "A joyous occasion celebrating a baby boy's birth.", 3.8));
        pastEventList.add(new Event(new Date(2022, 2, 31), "Michael and Micha's Wedding", "A grand wedding celebration filled with love and happiness.", 5.0));
        pastEventList.add(new Event(new Date(2023, 11, 15), "Ron and Rona's Wedding", "A memorable wedding ceremony and reception.", 2.4));
        pastEventList.add(new Event(new Date(2023, 8, 4), "Shira's Bat Mitzvah", "A significant milestone celebration for a young girl.", 4.7));
        pastEventList.add(new Event(new Date(2022, 9, 22), "Einat's Birthday Party", "A fun-filled birthday party with friends and family.", 5.0));
        pastEventList.add(new Event(new Date(2023, 4, 4), "Shmuel's Bar Mitzvah", "A meaningful religious ceremony for a young boy.", 4.9));
        pastEventList.add(new Event(new Date(2022, 11, 12), "Sarah and David's Wedding", "A romantic wedding celebration filled with joy.", 4.2));
        pastEventList.add(new Event(new Date(2023, 1, 28), "Company Anniversary Party", "A special event marking the company's successful years.", 4.8));
        pastEventList.add(new Event(new Date(2022, 7, 6), "Summer Music Festival", "An unforgettable music festival under the summer sun.", 4.5));
        pastEventList.add(new Event(new Date(2023, 2, 10), "Graduation Ceremony", "A proud moment for graduates celebrating their achievements.", 4.7));
        pastEventList.add(new Event(new Date(2022, 6, 18), "Family Reunion", "A joyful gathering of extended family members.", 4.3));
        pastEventList.add(new Event(new Date(2023, 10, 1), "Charity Gala Dinner", "A glamorous fundraising event supporting a worthy cause.", 4.9));
        pastEventList.add(new Event(new Date(2022, 3, 30), "New Year's Eve Party", "A lively celebration to welcome the new year.", 4.6));

        return pastEventList;

    }

}
