
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








