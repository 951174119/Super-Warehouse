
#体育竞技分析：模拟N场比赛
#计算思维：抽象+自动化
#模拟：抽象比赛过程+自动化执行N场比赛
#当N越大时，比赛结果分析会越科学
#实例
#比赛规则
#双人击球比赛：A&B，回合制，5局3胜
#开始时一方先发球，直至判分，接下来胜者发球
#球员只能在发球局得分，15分胜一局
#程序总体框架及步骤
#步骤一：打印程序的介绍性信息式
#步骤二：获得程序运行参数：proA，proB，n（A、B的能力值）
#步骤三：利用球员A和B的能力值，模拟n局比赛
#步骤四：输出球员A和B获胜比赛的场次及概率
import random
def printIntro():
    print('这个程序模拟两个选手A和B的某种竞技比赛')
    print('程序运行需要A和B的能力值（以0到1之间的小数表示）')
def getInputs():
    a=eval(input('请输入选手A的能力值（0-1）：'))
    b=eval(input('请输入选手B的能力值（0-1）'))
    n=eval(input("模拟比赛的场次："))
    return a,b,n
def printSummary(winsA,winsB):
    n=winsA+winsB
    print('竞技分析开始，共模拟{}场比赛'.format(n))
    print('选手A获胜{}场比赛，占比{:0.1%}'.format(winsA,winsA/n))
    print('选手B获胜{}场比赛，占比{:0.1%}'.format(winsB,winsB/n))
def gameOver(a,b):
    return a==15 or b==15
def simOneGame(probA,probB):
    scoreA,scoreB=0,0
    serving='A'
    while not gameOver(scoreA,scoreB):
        if serving=='A':
            if random.random()<probA:
                scoreA+=1
            else:
                serving='B'
        else:
            if random.random()<probB:
                scoreB+=1
            else:
                serving='A'
    return scoreA,scoreB
def simNGames(n,probA,probB):
    winsA,winsB=0,0
    for i in range(n):
        scoreA,scoreB=simOneGame(probA,probB)
        if scoreA>scoreB:
            winsA+=1
        else:
            winsB+=1
    return winsA,winsB
def main():
    printIntro()
    proA,proB,n=getInputs()
    winsA,winsB=simNGames(n,proA,proB)
    printSummary(winsA,winsB)
main()
    









