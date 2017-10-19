HOW TO GET STARTED

Install Git tools to your command line via https://git-scm.com/download/win. Accept the defaults.

Install MySQL Workbench. We will be using MySQL for the backend data management tool. Download it here: https://dev.mysql.com/downloads/file/?id=468295. You do not need to register for an account.

You will also need to download the MySQL Server, which actually hosts all of the data. The workbench is an easy tool to make and run queries against it. Find it here: https://dev.mysql.com/downloads/file/?id=473605. Pick the version best suited to your OS (32 vs 64 bit).

To install the server, select the MySQL Server (32 or 64 bit based on what you have), MySQL Shell, and the utilities. Select the defaults for everything. Make sure you put a decent password as the root DB password and create a database user to play around in the database with.

BASIC GIT OPERATIONS

1. To clone the repository (pull down a local copy):
	a. Open the Start Menu and type 'cmd' to enter a command prompt.
	b. Navigate to a directory you want to store it.
		1. Command prompt starts at C:\Users\<your_username_here>.
		2. I usually create a directory just under this location, so like C:\Users\<username>\project
			a. Do this through the GUI or type 'mkdir project'
	c. Clone it by doing 'git clone <repository_url> <directorynamehere>'
		a. The repository URL can be found on the main screen here, or is just the URL for the webpage with a .git on the end.
		b. The directory name argument is optional, it specifies a directory to clone the files to. I usually put something short and descriptive here, like 'pathfinder'.
			1. This means my project will be stored at a path like C:\Users\<username>\project\pathfinder.
2. To commit and push files (send local edits back to the repository for other people to see them)
	a. Open a command prompt and navigate to the repository location (where you cloned it above).
	b. To add files selectively, do 'git add <path to file here>' and specify the path to the file you want to add. Note that this path is relative, and this must be a file in the cloned folder.
	c. To add all files, do 'git add .'
	d. To commit these changes, do 'git commit -m "Message Here"' where the message is text describing what you are committing.
	e. To send these files and edits back to the repository, do 'git push'.
		1. If it complains about not finding the remote repository or having to specify, do 'git push origin <branchname>' where branchname should be master, unless you are working on a branch.
