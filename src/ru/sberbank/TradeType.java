package ru.sberbank;

public enum TradeType {

    BOND{
        @Override
        public Trade createTrade(double price){
            System.out.println("BOND");
            return new BOND(price);
        }
    },
    COMMODITY_SPOT{
        @Override
        public Trade createTrade(double price){
            System.out.println("COMMODITY_SPOT");
            return new COMMODITY_SPOT(price);
        }
    },
    FX_SPOT{
        @Override
        public Trade createTrade(double price){
            System.out.println("FX_SPOT");
            return new FX_SPOT(price);
        }
    },
    IR_SWAP{
        @Override
        public Trade createTrade(double price){
            System.out.println("IR_SWAP");
            return new IR_SWAP(price);
        }
    };
    public abstract Trade createTrade(double price);
}
