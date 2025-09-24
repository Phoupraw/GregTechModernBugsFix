[中文](./README.md)
[English](./README-en.md)
# 格雷科技现代版漏洞修复
[![Modrinth](https://img.shields.io/modrinth/dt/gregtech-modern-bugs-fix?logo=modrinth&label=&suffix=%20&style=flat&color=242629&labelColor=5ca424&logoColor=1c1c1c)](https://modrinth.com/mod/infinite-fluid-bucket)

修复格雷科技现代版的一些漏洞。
## 内容
由于GTM 1.21开发人员缺失，导致GTM 1.21的许多良性或恶性漏洞连续数月没有得到修复，为了使我（和其他玩家）能够顺利游玩GTM 1.21，我制作了这个模组，使用Mixin修改GTM和LDLIB的代码，以此修复漏洞。

具体修复的漏洞和漏洞详情请见下方列表。

**注意！**这个模组只是为了使作者自己的存档正确运行，所以采用的修复方式有时比较激进，不保证不产生新的漏洞，不保证适用于所有快照版本。请在使用本模组时注意备份存档（其实玩GTM 1.21本身就应该频繁备份存档）。

目前已修复的漏洞：
- [#3730 Machines don't recognize splitted item stack](https://github.com/GregTechCEu/GregTech-Modern/issues/3730)
  - `MNotifiableItemStackHandler`
- [#1607 Can't get stack by EMI from multiblock recipe page](https://github.com/GregTechCEu/GregTech-Modern/issues/1607)
  - `MSlotWidget`
  - `GregTechModernBugsFixClient.afterKeyPressed`
- [#3963 Use prospector in offhand always in ore mode](https://github.com/GregTechCEu/GregTech-Modern/issues/3963)
  - `MProspectorScannerBehavior`
## 用法
像其他模组一样直接安装此模组即可，只要运行，对漏洞的修复就生效。
## 兼容性
没有已知的冲突模组（毕竟GTM 1.21就没几个附属和联动模组）。
## 常见问题
（其实这些问题都是我自己想的，并没有人问过）
### 为什么不直接在GTM上修复漏洞，而是要用额外的模组？
因为我克隆GTM项目后Gradle总是构建失败，所以我无法直接在GTM项目里编译运行，也就无法提交PR。但是如果我创建一个新模组，并在此模组中依赖GTM，则可以正常构建、编译运行，所以我只能以GTM附属模组的形式来修复GTM的漏洞。
### 为什么某某漏洞没有被修复？
因为我刚刚开始修复，所以优先修复那些对游玩影响大的漏洞，对正常游玩影响不大的漏洞优先级较低。