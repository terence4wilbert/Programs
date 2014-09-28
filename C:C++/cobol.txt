   IDENTIFICATION DIVISION.
      *
      PROGRAM-ID LAB07.
      *
      ENVIRONMENT DIVISION.
      *
      INPUT-OUTPUT SECTION.
      *
      FILE-CONTROL.
      *
          SELECT CRSEREG ASSIGN TO CRSEREG
              ORGANIZATION IS SEQUENTIAL.
          SELECT STUMAST ASSIGN TO STUMAST
              ORGANIZATION IS SEQUENTIAL.
          SELECT NEWMAST ASSIGN TO OUTFILE.
          SELECT ERRRPT ASSIGN TO ERRRPT.

      *
      DATA DIVISION.

      FILE SECTION.
      *
      FD  STUMAST
          RECORDING MODE IS F
          RECORD CONTAINS 104 CHARACTERS
          DATA RECORD IS STUDENT-MASTER-RECORD.
      *
      COPY STUMAST.

      FD  CRSEREG
          RECORDING MODE IS F
          RECORD CONTAINS 83 CHARACTERS
          DATA RECORD IS COURSE-REGISTRATION-RECORD.
      COPY CRSEREG.

      FD  NEWMAST
          RECORDING MODE IS F
          RECORD CONTAINS 104 CHARACTERS
          DATA RECORD IS PRINT-NEW-STUDENT-RECORD.
          01 NEW-STUDENT-RECORD.
          05 PRINT-NEW-STUDENT-RECORD        PIC X(104).

      *
          FD ERRRPT
          RECORDING MODE IS F
          RECORD CONTAINS 120 CHARACTERS
          DATA RECORD IS PRINT-AREA.
      *
          01 PRINT-RECORD.
          05 PRINT-AREA              PIC X(120).


      *
      WORKING-STORAGE SECTION.

          01 SWITCHES.
          05 STUDENT-FOUND-SWITCH        PIC 9  VALUE 0.
            88 STUDENT-FOUND                  VALUE 1.
            88 STUDENT-NOT-FOUND              VALUE 2.
            88 STUDENT-EOF                    VALUE 3.

          05 CRSEREG-EOF-SWITCH  PIC X          VALUE "N".
            88 CRSEREG-EOF                    VALUE "Y".
      *
          01 BS-ACCUMULATORS.
          05 BS-TOTAL-COURSE-UNITS        PIC 9(5)    VALUE 0.
          05 BS-TOTAL-GRADE-POINTS        PIC 9(5)    VALUE 0.
          05 BS-TOTAL-UPDATES            PIC 9(5)    VALUE 0.
          05 BS-TOTAL-MISSING            PIC 9(5)    VALUE 0.
          01 BS-MISC-FIELDS.
          05 BS-GRADE-POINTS              PIC 9(5)    VALUE 0.
          05 BS-SAVE-STUDENT-ID          PIC 9(5)    VALUE 0.
          05 BS-SAVE-STUDENT-NAME        PIC X(30)    VALUE SPACES.
      *
          01 BS-DATE-AND-TIME.
          05 BS-DATE      PIC 99/99/9999.
          05 BS-TIME.
              10 HOUR    PIC 99 BINARY.
              10 FILLER  PIC X(01) VALUE ':'.
              10 MINUTE  PIC 99 BINARY.
      *
          01 BS-HDR-1.
          05  FILLER                PIC X(7)    VALUE "DATE:  ".
          05  HDR-1-MONTH            PIC 9(2).
          05  FILLER                PIC X(1)    VALUE "/".
          05  HDR-1-DAY              PIC 9(2).
          05  FILLER                PIC X(1)    VALUE "/".
          05  HDR-1-YEAR            PIC 9(4).

          01 BS-HDR-2.
          05  FILLER                PIC X(7)    VALUE "TIME:  ".
          05  HDR-2-HOUR            PIC 9(2).
          05  FILLER                PIC X(1)    VALUE ":".
          05  HDR-2-MINUTE          PIC 9(2).

          01 BS-HDR-3.
          05  FILLER                PIC X(15)    VALUE SPACE.
          01 BS-HDR-SPACERS.
          05 FILLER  PIC X(2)    VALUE "--".
          01 BS-CURRENT-DATE-FIELDS.
          05  BS-CURRENT-YEAR                PIC 9999.
          05  BS-CURRENT-MONTH              PIC 99.
          05  BS-CURRENT-DAY          PIC 99.
          05  BS-CURRENT-HOUR          PIC 99.
          05  BS-CURRENT-MINUTE        PIC 99.
          05  FILLER                  PIC X(9).


      PROCEDURE DIVISION.
      *
      000-PREPARE-REPORT.
      *
          OPEN INPUT      STUMAST
                          CRSEREG
          OUTPUT          NEWMAST
                          ERRRPT.

          PERFORM 100-READ-STUMAST
              UNTIL STUDENT-EOF.
          PERFORM 200-READ-COURSE
              UNTIL CRSEREG-EOF.




          CLOSE  STUMAST
                  CRSEREG
                  NEWMAST
                  ERRRPT.
          STOP RUN.
      *
      100-READ-STUMAST.
      *
          READ STUMAST
              AT END
                  SET STUDENT-EOF TO TRUE
              NOT AT END
                  IF (BS-SAVE-STUDENT-ID NOT EQUAL SM-STUDENT-ID)
                      MOVE STUDENT-MASTER-RECORD
                          TO PRINT-NEW-STUDENT-RECORD.
                      WRITE NEW-STUDENT-RECORD.


      200-READ-COURSE.
          READ CRSEREG
              AT END

                  SET CRSEREG-EOF TO TRUE
              NOT AT END
              MOVE CR-STUDENT-ID TO BS-SAVE-STUDENT-ID.
              MOVE CR-STUDENT-NAME TO BS-SAVE-STUDENT-NAME.
              IF (BS-SAVE-STUDENT-ID NOT EQUAL SM-STUDENT-ID)
                      MOVE STUDENT-MASTER-RECORD
                          TO PRINT-AREA.
                      WRITE PRINT-RECORD.





