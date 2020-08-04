#### Question: Write a video player application with ‘Play’, ‘Forward’, ‘Rewind’ functionalities. Please write pseudocode for this program and explain the design pattern you will use to develop these three functionalities.

**Solution:** Here, the application for Problem-3 with video ‘Play’, ‘Forward’, ‘Rewind’ functionalities. By using Java, MVVM Design pattern, XML etc this application is developed. 

**Pseudocode:** Pseudocode for Play, Forward and Rewind functionalities is given-

Play Pseudocode:

if VideoPlayer stage at end
   VideoPlayer seek to 0
VideoPlayer-> PlayWhenReady

Forward Pseudocode:

NextForwardTime = VideoPlayer-> CurrentTime + ForwardTimeAmount
if NextForwardTime above of VideoTotalTime
   VideoPlayer seek to VideoTotalTime
else
   VideoPlayer seek to NextForwardTime
   
Rewind Pseudocode:

NextRewindTime = VideoPlayer-> CurrentTime - RewindTimeAmount
if NextRewindTime below 0
   VideoPlayer seek to 0
else
   VideoPlayer seek to NextRewindTime
