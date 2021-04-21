`gti add`*精确地将内容添加到下一次提交中*  
+ 将未跟踪的文件进行跟踪  
+ 在修改文件后将修改进行暂存
+ 合并冲突后标记为已解决状态  

`git diff`
- 比较的是工作目录中**当前文件**和**暂存区域**快照之间的差异
- 若要查看已暂存的将要添加到下次提交里的内容，可以用 `git diff --staged(或者cached,同义词）` 命令

`git restore`将工作区的文件修改撤销，不涉及暂存区，`git restore --staged`将暂存区的内容撤销，恢复到和仓库一样的，而工作区的不会改变  
`git reset`

1. branch master修改
2. 通过originmaster1修改文件
3. 切换branch到mybranch1 
4. 再次通过mybranch1修改文件
