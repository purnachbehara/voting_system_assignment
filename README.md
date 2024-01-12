A API based Voting system spring boot project for a assignment submission

Tools needed to run
-------------------

-> Need to have a IDE
	ECLIPSE OR INTELLIJIDEA
	"https://www.eclipse.org/downloads/" for eclipse
	https://www.jetbrains.com/idea/download/?section=windows for  INTELLIJIDEA
	
	or follow
	https://www.youtube.com/watch?v=ZRRC2aH0eec

-> Install spring tool suite in your system
	follow
	https://www.youtube.com/watch?v=1TBE0y5xBkU

-> Install lombok in your system
	https://projectlombok.org/download
   click on download and run the jar and follow the instructions

How to execute
--------------

open the master file in eclipse from unzipped download

Run the project as "spring boot app"

Now the project is runnig on the default port localhost:8080

Open Browser ,Since all RestController methods is mapped by Get request ,from browser hit the following URLs to do respective tasks

 http://localhost:8080/entercandidate?name=candidate_Name  ->for create a candidate

 http://localhost:8080/castvote?name=candidate_Name  ->for increasing number of votes by one of a valid candidate

 http://localhost:8080/countvote?name=candidate_Name  ->for getting number of votes of a candidate

 http://localhost:8080/listvote  ->for listinfg out all candidates

 http://localhost:8080/getwinner  ->for getting winning candidate

