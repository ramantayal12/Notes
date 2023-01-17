# Git 

Git is the free and open source distributed version control system that's responsible for everything GitHub related that happens locally on your computer.

## 1. SetUp
Configuring user information used across all local repositories.
1.  set a name that is identifiable for credit when review version history

    > git config --global user.name “[firstname lastname]” 

2. set an email address that will be associated with each history marker

    > git config --global user.email “[valid-email]”

3. set automatic command line coloring for Git for easy reviewing

    > git config --global color.ui auto

## 2. Init
Configuring user information, initializing and cloning repositories

1. initialize an existing directory as a Git repository

    > git init 

2. retrieve an entire repository from a hosted location via URL
    
    > git clone [url]

## 3. Stage and SnapShot
Working with snapshots and the Git staging area.
1. show modified files in working directory, staged for your next commit.

    > git status 

2. add a file as it looks now to your next commit (stage).
    > git add [file]

   Note : for adding all files
    > git add .

3. unstage a file while retaining the changes in working directory.
    > git unstage [file]

4. diff of what is changed but not staged.
    > git diff 

5. diff of what is staged but not yet committed.
    > git diff --staged

6. commit your staged content as a new commit snapshot.
    > git commit -m "[commit_message]"

## 4. BRANCH & MERGE
Isolating work in branches, changing context, and integrating changes
1. list your branches. a * will appear next to the currently active branch.
    > git branch

2. create a new branch at the current commit
    > git branch [branch-name]

3. switch to another branch and check it out into your working directory.
    > git checkout

4. merge the specified branch’s history into the current one.
    > git merge [branch]

5. show all commits in the current branch’s history.
    > git log 

## 5. TRACKING PATH CHANGES
1. delete the file from project and stage the removal for commit.
    > git rm [file]

## 6. Temporary Commits
Temporarily store modified, tracked files in order to change branches

1. Save modified and staged changes.
    > git stash 

2. list stack-order of stashed file changes.
    > git stash list 

3. write working from top of stash stack.
    > git stash pop

4. discard the changes from top of stash stack.
    > git stash drop

## 7. ReWrite History 

Rewriting branches, updating commits and clearing history

1. apply any commits of current branch ahead of specified one.
    > git rebase [branch_name]

2. clear staging area, rewrite working tree from specified commit.
    > git reset --hard [commit]

## 8. Share and Update 

Retrieving updates from another repository and updating local repos

1. add a git URL as an alias
    > git remote add [alias] [url]

2. fetch down all the branches from that Git remote
    > git fetch [alias]

3. merge a remote branch into your current branch to bring it up to date.
    > git merge [alias]/[branch]

4. Transmit local branch commits to the remote repository branch.
    > git push [alias] [branch]

5. fetch and merge any commits from the tracking remote branch.
    > git pull 


## 9. Squashing Commits 

1. Squashing Commits
    > git rebase -i HEAD~3

