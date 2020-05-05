package com.github.greekpanda.state;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 16:41
 */
public class RaffleActivity {

    State state = null;
    int count = 0;
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);

    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void deductMoney() {
        state.deductMoney();
    }

    public void raffle() {
        if (state.raffle()) {
            state.dispensePrice();
        }
    }

    public State getCanRaffleState() {
      return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }


    public State getDispenseOutState() {
        return dispenseOutState;
    }
}
