package seedu.address.logic.parser;

//import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
//import static seedu.address.logic.commands.CommandTestUtil.DATETIME_DESC_ACTIVITY;
//import static seedu.address.logic.commands.CommandTestUtil.DATETIME_DESC_BIKING;
//import static seedu.address.logic.commands.CommandTestUtil.IMPT_DESC_BIKING;
//import static seedu.address.logic.commands.CommandTestUtil.INDEX_DESC_ACTIVITY;
//import static seedu.address.logic.commands.CommandTestUtil.INDEX_DESC_BIKING;
//import static seedu.address.logic.commands.CommandTestUtil.NAME_DESC_ACTIVITY;
//import static seedu.address.logic.commands.CommandTestUtil.NAME_DESC_BIKING;
//import static seedu.address.logic.commands.CommandTestUtil.PLACE_DESC_ACTIVITY;
//import static seedu.address.logic.commands.CommandTestUtil.PLACE_DESC_BIKING;
//import static seedu.address.logic.commands.CommandTestUtil.TAG_DESC_FRIEND;
//import static seedu.address.logic.commands.CommandTestUtil.VALID_DATE_BIKING;
//import static seedu.address.logic.commands.CommandTestUtil.VALID_INDEX_BIKING;
//import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BIKING;
//import static seedu.address.logic.commands.CommandTestUtil.VALID_PLACE_BIKING;
//import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
//import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//
//import seedu.address.commons.core.index.Index;
//import seedu.address.logic.commands.AddMeetingCommand;
//import seedu.address.model.meeting.DateTime;
//import seedu.address.model.meeting.Meeting;
//import seedu.address.model.meeting.MeetingTag;
//import seedu.address.model.meeting.NameMeeting;
//import seedu.address.model.meeting.Place;
//import seedu.address.model.tag.Tag;
//import seedu.address.testutil.MeetingBuilder;

public class AddMeetingCommandParserTest {
    /**
    private AddMeetingCommandParser parser = new AddMeetingCommandParser();

    @Test
    public void parse_allFieldsPresent_success() {
        Meeting expectedMeeting = new MeetingBuilder().withNameMeeting(VALID_NAME_BIKING).
                withDateTime(VALID_DATE_BIKING)
                .withPlace(VALID_PLACE_BIKING).withIndex(Index.fromOneBased(2)).build();

        List<Index> indexes = new ArrayList<>();
        indexes.add(Index.fromOneBased(2));

        // multiple names of meeting - last nameMeeting accepted
        assertParseSuccess(parser, AddMeetingCommand.COMMAND_WORD + INDEX_DESC_BIKING +
                NAME_DESC_ACTIVITY + NAME_DESC_BIKING + DATETIME_DESC_BIKING
                + PLACE_DESC_BIKING + IMPT_DESC_BIKING, new AddMeetingCommand( expectedMeeting.getName(),
                expectedMeeting.getDate(), expectedMeeting.getPlace(), indexes, expectedMeeting.getMeetTag()));

        // multiple DateTime - last DateTime accepted
        assertParseSuccess(parser, AddMeetingCommand.COMMAND_WORD + INDEX_DESC_BIKING + NAME_DESC_BIKING
                + DATETIME_DESC_ACTIVITY + DATETIME_DESC_BIKING + PLACE_DESC_BIKING + IMPT_DESC_BIKING,
                new AddMeetingCommand(expectedMeeting.getName(), expectedMeeting.getDate(),
                        expectedMeeting.getPlace(), indexes,
                        expectedMeeting.getMeetTag()));

        // multiple places - last place accepted
        assertParseSuccess(parser, AddMeetingCommand.COMMAND_WORD + INDEX_DESC_BIKING + NAME_DESC_BIKING +
                DATETIME_DESC_BIKING + PLACE_DESC_ACTIVITY + PLACE_DESC_BIKING,
                new AddMeetingCommand(expectedMeeting.getName(),
                expectedMeeting.getDate(), expectedMeeting.getPlace(), indexes, expectedMeeting.getMeetTag()));
    }
    */
}
