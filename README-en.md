# GregTech Modern Bugs Fix
Fix some bugs of GregTech CEu Modern.
# Content
Due to the lack of developers for GTM 1.21, numerous benign and malicious bugs in GTM 1.21 have remained unpatched for months. To ensure that I (and other players) can play GTM 1.21 normally, I have created this mod. It uses Mixin to modify the code of GTM and LDLIB, thereby fixing the bugs.

For the specific bugs fixed and their details, please refer to the list below.

**Attention!** This mod is only intended to make the author's own save file run properly. Therefore, the methods to fix bugs are sometimes radical. There is no guarantee that no new bugs will be introduced, nor is there a guarantee that it is compatible with all snapshot versions. Please make sure to back up your saves when using this mod (in fact, you should back up your saves frequently when playing GTM 1.21 itself).

bugs fixed so far:
- [#3730](https://github.com/GregTechCEu/GregTech-Modern/issues/3730)
- [#1607](https://github.com/GregTechCEu/GregTech-Modern/issues/1607)
# Usage
You can install this mod directly just like any other mod. As long as it runs, the bug fixes will take effect.
# Compatibility
There are no known conflicting mods (after all, there are very few add-ons for GTM 1.21).
# Frequently Asked Questions
(In fact, these questions are all made up by myself; no one has actually asked them.)
### Why not fix the bugs directly in GTM instead of using an additional mod?
Because after I cloned the GTM project, Gradle always failed to build. As a result, I couldn't compile and run the project directly in GTM, and thus couldn't submit a PR. However, if I create a new mod and depend on GTM in this mod, I can build, compile, and run it normally. Therefore, I can only fix GTM's bugs in the form of a GTM add-on mod.
### Why hasn't XXX bug been fixed?
Because I have just started fixing bugs, I prioritize fixing those that have a significant impact on gameplay. bugs that have little impact on normal gameplay are given lower priority.