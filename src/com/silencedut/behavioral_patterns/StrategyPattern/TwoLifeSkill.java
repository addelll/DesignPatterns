package com.silencedut.behavioral_patterns.StrategyPattern;

/**
 * Created by SilenceDut on 16/6/20.
 */

 class TwoLifeSkill implements Skill {
    @Override
    public void skill() {
        System.out.println("Has two life");
    }
}
