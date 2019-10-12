# HenCoder Android 开发进阶：自定义 View 1-5 绘制顺序 (练习项目)

## View绘制流程
#### draw是总的调度方法
##### drawBackground
##### onDraw
##### dispatchDraw（ViewGroup会用到，遍历子View并调用child.onDraw）
##### onDrawForeground
