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







