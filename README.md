
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


Screen clipping taken: 10-07-2020 10:29 AM








