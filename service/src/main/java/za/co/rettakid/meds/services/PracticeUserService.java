package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface PracticeUserService    {

    PracticeUserListDto getPracticeUsers();

    PracticeListDto getPracticesForUser(Long userId);

    PracticeUserDto getPracticeUsers(Long practiceUserId);
    PracticeUserDto postPracticeUsers(PracticeUserDto practiceUserDto);
    void putPracticeUsers(PracticeUserDto practiceUserDto);
    void deletePracticeUsers(Long practiceUserId);

}