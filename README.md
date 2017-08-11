

# Pre-work - *SimpleToDo App*

**SimpleToDo App** is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: **Shrividya Manmohan**

Time spent: **8** hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **successfully add and remove items** from the todo list
* [x] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [x] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [ ] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<blockquote class="imgur-embed-pub" lang="en" data-id="dCr1KTc"><a href="//imgur.com/dCr1KTc">Video Walkthrough</a></blockquote>


GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? 
Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:** 
Android App Development Platform has been a very good experience for me. 
Since, I have exposure to eclipse IDE and Springboot STS suite, I am more familiar with the backend using Java. 
This project has given me better understanding of Android and XML for UI. 

The EditActivity in my app uses the PercentRelativeLayout, which was new to me. 
I do not have much experience in layouts on other platforms to compare and contrast with Android.

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** 
ArrayAdapter in the SimpleToDo app is basically providing views for the collection of objects in ListView layout. 
In the SimpleToDo app, ListView layout contains an ArrayList of Strings(user populated ToDo Items).
So, ArrayAdapter provides a view for each list item.

## Notes

Describe any challenges encountered while building the app.

Below are some of the challenges I faced:
1. Working with Intents, passing data from the sub activity to the main activity.
2. Working with the User Interface, especially RelativeLayout which was a little tricky. 
   I have also used a recent version of RelativeLayout, called PercentRelativeLayout for the sub activity.

## License

    Copyright [2017] [Shrividya Manmohan]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
