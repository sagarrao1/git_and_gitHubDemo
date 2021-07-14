
# Git and github Commands

tree -- show sub folders in tree structure

GIt commands

git init -- to initiate repository
git add . -- to add snapshot of projects in current folder to git
git commit -m "First commit of project"

git status -- to see modified files

git add modified_file

git status -- will show now green

git diff hex_decimal number of 2 commits -- will show difference

git commit - m "Second commit"

if we want to go back previous commit

git checkout version _number


--To decode hash code generated for commits

git log -- shows list of commits
git cat-file hascode -p

To count no.of objects in curr directory
git count-objects 

Tags in git : tag is another type of object. Tag is like label to current state of the project
There are 2 types of tags regular tags , annotated tags
Difference between tags and branch is tags won't move branch moves when there is new commnit

git tag -a myTag -m "I love cheese"
 
git tag
myTag
git cat-file -p myTag

There are 4 types of objects in git
Blobs -- arbiter content
Tree  -- equal to directories
commit
Annotated tag

-Branches
git branch
Git puts branches in .git folder under ref folder and in heads

git cat-file -p hash_code

Head is pointer to current branch. Lets say if we have 2 branches master and lisa and our current branch is master
Head is pointed to master
Master and lisa branches are at 520 commit level
When we did new commit
Current branch is  master  move ahead as HEAD is pointed to master , it also moves along







To point to lisa branch
Git checkout lisa
When we say git checkout, it does 2 things, 
1. it points HEAD to lisa branch now we can check this by command
cat .git/HEAD
ref: refs/heads/lisa  --output

2.it gets lisa branch file to local. Whatever you did commits to master are removed in local file (menu.txt)
Update menu.txt file
git add menu.txt  -- to stage the file
git commit - m "commiting lisa branch menu.txt"

Now we have 2 branches with diff commits. We need to merge both branches




Master branch menu.txt has different data and
Lisa branch menu.txt has different data.
We want to merge lisa branch data into master branch

Go to master branch
git checkout master
git merge lisa
It will give you error saying auto merge failed , we need resolve conflicts manually and commit
git status  -- will give which file has conflicts, open that file vi editor
vi menu.txt  -- remove conflicts
git status -- will still be red as it did know we have resolved conflict. We need to do
git add menu.txt
git commit    --  no need to provide commit message as it add by default
git log   -- to see commit changes. It says merge. If you want to see the merge objects
git cat-file -p hash_code from above log

A merge is also a commit, but will have 2 parents
Git merged 2 parents and created new commit and moved master to point new commit



Screen clipping taken: 10-07-2020 07:55 AM


If we want lisa branch to have latest changes with master
We already merged lisa branch to master
To merge lisa to get latest changes
Erliar we merged lisa into master now we want to merge master into lisa

git checkout lisa  -- now HEAD will point at lisa



Screen clipping taken: 10-07-2020 09:43 AM

git merge master -- it won't again do commit simply fast forward  lisa to ecbe commit point above
This is called fast forward



Screen clipping taken: 10-07-2020 09:47 AM


Loosing head
Like we point HEAD to master and lisa branches , we can point HEAD to commit also
Then we call it has detached head
git log
git checkout some_hascode_from_above_commit
git branch
Now it will show * pointing to head and master, lisa branches
Do some changes to menu.txt
Vi menu.txt
git status
git add menu.txt
git commit -m "added 20 apples"
do some changes
git commit -m "make it sugar free"



Screen clipping taken: 10-07-2020 10:27 AM


Now for reason I want switch back to master branch
git checkout master

recap of commands for others as well. Sorry for the long post though. Looking forward for module 2.
WINDOWS COMMANDS:
dir - List all folder contents
dir /a - List all files and hidden files
dir /ah - List all hidden files and hidden directories in the current directory.
type menu.txt - contents of a file
tree - to show tree
echo This is a sample text file > sample.txt - add contents to a file
GIT SPECIFIC COMMANDS:
git init - initialize a Repo or Reinitialized the existing Git repository
git status
git add menu.txt
git add recipes/
git commit -m "First Commit!"
git log
git cat-file -p ca4174b9c48dac61864e730e6b914c034a67a54e - See contents of a commit
UPDATED: MODULE 2 recap/reference commands:
git branch lisa - creates a new branch named lisa
git branch - shows branches and also indicates the current branch by *
git add recipes/apple_pie.txt
git commit -m "New recipe added!"
git checkout lisa - switch to newly created branch
git branch - observe branch change visually
git checkout master
git merge lisa

From <https://disqus.com/embed/comments/?base=default&f=pluralsight-1&t_i=http%3A%2F%2Fpluralsight.com%2Fcourses%2Fhow-git-works&t_u=http%3A%2F%2Fpluralsight.com%2Fcourses%2Fhow-git-works&t_e=How%20Git%20Works&t_d=How%20Git%20Works%20%7C%20Pluralsight&t_t=How%20Git%20Works&s_o=default#version=740757db2906a25d5ed962b135a390c3> 





git clone "github url"    --- to get cloud git repository to local



To see branches, 
git branch
to see all hidden branches
git branch --all



Git show-ref master
Git satge file_name or folder/
Git commit -m "msg1"

Git & github commands

To set name and email
git config --edit --global

To open notepad++ editor from cmd > environment var > path > notepad++
When you type notepad++ in cmd , it will open 

To set default editor as notepad++ in git :
git config core.editor "notepad++ -multiInst -nosession"

git config --edit --global

To create new git project
git init "gitDemoApp"

cd gitDemoApp
ls -la

notepad++ README.md
git status
git add filename , git add . -- all files  add= stage files
git commit -m "1st commit"
git log

git remote -v  -- to know whether it is connected to githib remote repository

To push an existing repository from the command line
git remote add origin https://github.com/sagarrao1/git_and_gitHubDemo.git
git push -u origin master

git remote -v -- to verify remote repo is linked or not

Connecting to github repo is 2 ways 1. https 2.SSH
Using https you need to enter password every time you want push repo to remote

SSH is also as secure as https

Setting up SSH key

$ git remote -v
origin  https://github.com/sagarrao1/git_and_gitHubDemo.git (fetch)
origin  https://github.com/sagarrao1/git_and_gitHubDemo.git (push)

$ ssh-keygen -t rsa -b 4096 -C "sagarrao1@gmail.com"

Generating public/private rsa key pair.
Enter file in which to save the key (/c/Users/sagar/.ssh/id_rsa):
Created directory '/c/Users/sagar/.ssh'.
Enter passphrase (empty for no passphrase):
Enter same passphrase again:
Your identification has been saved in /c/Users/sagar/.ssh/id_rsa.
Your public key has been saved in /c/Users/sagar/.ssh/id_rsa.pub.

$ ssh -T git@github.com
The authenticity of host 'github.com (13.234.176.102)' can't be established.
RSA key fingerprint is SHA256:nThbg6kXUpJWGl7E1IGOCspRomTxdCARLviKw6E5SY8.
Are you sure you want to continue connecting (yes/no)? yes
Warning: Permanently added 'github.com,13.234.176.102' (RSA) to the list of known hosts.
Hi sagarrao1! You've successfully authenticated, but GitHub does not provide shell access.

README is special file which tells about repo, who has written, what the content is
How it helps the project, who owns it , who contributed to this project.
Rendered automatically on landing page of git hub
Right folder put this are root, .git, docs folder

Typically written in markdown (.md) format


More on .md syntax
# This is an H1 #
## This is an H2 ##
Markdown supports ordered (numbered) and unordered (bulleted) lists.
Unordered lists use asterisks, pluses, and hyphens — interchangably — as list markers:
*   Red
*   Green
*   Blue
is equivalent to:
+   Red
+   Green
+   Blue
and:
-   Red
-   Green
-   Blue
Ordered lists use numbers followed by periods:
1.  Bird
2.  McHale
3.  Parish

From <https://daringfireball.net/projects/markdown/syntax> 


From sursh tech telugu

To stage all files
git add .
Git is telugu
https://youtu.be/LIhE7L__E6M


Completed 3.01 of 6.28 hrs video




Screen clipping taken: 12-07-2021 12:09 PM

To ignore files or un track file add folder or files or file structure in .gitignore file

.gitignore
/target/
*.log
*.war




Screen clipping taken: 12-07-2021 06:07 PM

git stats vs git diff

git diff
Git diff will show difference between modified file vs staged file

git diff --staged
To see only staged file data

To add more details while commiting (verbose)
git commit -v 

To add inline comments while commiting (verbose)
git commit -m " provide comments"

Command to give both add and commit at same time and provide git comments
git commit -am "comments"

To see Log history

git log
git log -p   (more info like committed changed )
git log -5  ( to see last 5 commits )
git log --oneline  ( shows commit id in short first 5 chars)

git log --pretty=online   (  each commit log in one line)
git log --pretty=shortline   (  each commit log in 2 lines. More info)
git log --pretty=full   (  more info each commit like author and committer)
git log --pretty=fuller   (  each commit log in one line)

Author is who has created file
Committer is who has committed the file

Git branching

To create new branch
git branch "branch name"

see head is still pointed to master
git log --oneline

To checkout or move to new branch
git checkout  branch-name
git log --oneline
git log --oneline --all ( to see all commits of all branches )

git log --oneline --graph  (graphical repres of commits in that branch )
git log --oneline --graph --all

To create new branch and checkout to new branch in one command
git checkout  -b  "email-fix"

Modify some file , add email address (menu.txt)
git status
git add menu.txt
git commit -m  "updated email fix"

Now master is one commit behind from email-fix branch

Now we need to merge email-fix into master. We need to checkout master branch where we need merge
git checkout master
git merge email-fix
ls
cat menu.txt to see email add added to the file

Deleting branch
git branch -d email-fix

 
To what branches are merged and what not
git  branch --merge

git  branch --no-merge  (to see what are not merged)

To see list of branches
git branch -a

Update same file in both branches (master and brach_demo)
git checkout master
git merge branch_demo

You will get merge conflicts due same file at same line has diff data
To see merge conflicts
git status

Resolve commits by open conflict file in vi editor
Once conflict is done
git add menu.txt
git commit -m  "comments"

To see log in graphs
git log --oneline --graph --all

Remote branches
git remote

Pull and fetch remote
Add a new file in git remote in github file (https://github.com/sagarrao1/git_and_gitHubDemo)

Now changes are in your remote but not in ur local
2 ways to get (git fetch and git pull )

git fetch origin ( we will get changes from remote but it will not be local master , it will be origin/remote/master)
To see this 
git branch -a

Now we need to merge origin/master into master
git merge origin/master

Add a new file in git remote in github file (https://github.com/sagarrao1/git_and_gitHubDemo)

git pull origin master
git log --oneline --graph --all

git pull = fetch +merge

configuring p4merge tool in git bash

Config below once toll is installed

Diff tool config
git config --global diff.tool p4merge
git config --global difftool.p4merge.path "C:/Program Files/Perforce/p4merge.exe"
git config --global difftool.prompt false

Merge tool config
git config --global merge.tool p4merge
git config --global mergetool.p4merge.path "C:/Program Files/Perforce/p4merge.exe"
git config --global mergetool.prompt false


Now prepare conflict, then tool to show
git merge tool

It will open merge , click blue or green button whichever code you want , save it

Setting aliases
git config --global alias.allcommits " log --oneline --graph --all"
grit allcommits

Rebase
git log --oneline --all --graph
git show commit_id

Git merge and rebase both are same and used to merge changes in base branch from another branch
Rebase will give linear graph and avoids merge commit Where as merge will give extract merge commit, will show in git log history and graph 


Stash -- will move modified file which are not staged and committed files to recycle bin
Existing files will go to backup

Do some changes to one file
ls 
Vi file.txt

git status   -- will show modified file
git stash
git status
ls   File.txt won't be there
git stash list

To get back last change
git stash apply  --  last stashed changes will come back to see git status

git stash drop  -- to drop last stash from stack


git stash pop   -- will apply the last stash and drop if from stack
git stash -u   to stash untracked files also

git stash apply stash@{1}  --- to get back particular stash id

Changes are stored in stash{0} -- last changes stash{1} -- last 2nd stashed files
If you want to retrieve last to last change you need to give git stash apply stash@{1}

clean

clean if permanent delete, stash is temporary delete, we can get back but clean is like sft+delete

git clean - will delete all un tracked files only, it won't delete tracked /modified files
git clean -f   -- to delete un tracked files forcefully
git clean -f -d   --- to delete un tracked directories
git clean -f -d -x   --- to delete un tracked directories, and delete .gitignore file also

For dry run to see what files will be delete before clean them
Add some new files
git clean -f -n


Other branch commands
git branch -a   ------ will list all branches including origin remote branches
git remote -v   -------- will give you path remote branches

Tag

Tag is used mark commit as version 1 changes or release changes completed here
When we look at history , till which commits are release 1 , release 2 , etc
Just to identify till what changes are in release 1 and etc..
git tag -l   ---- shows list of tags

git tag -l "v.*"  ---- filter list of tags
to create tag
git tag v2.0

To create tag with description
git tag -a v2.0 -m "tag description"

To compare what changes are done between 2 tags
git diff v0.1 v2.0  (two tag names)

To delete tag
Git tag -d v0.1

You can give tag to old commits as well
git log --oneline --all --graph
git tag -a v1.0 commit id

You can update existing tags to different commit id
git tag -a v1.0 -f another_commit_id where you want to change

To push changes to remote we use
git push origin master    we should always use pull before push to origin 
But push tags we should use below command
git push origin master --tags













