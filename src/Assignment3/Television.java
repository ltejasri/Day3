package Assignment3;

public class Television {
	
		public static final int MIN=0;
		public static final int MAX=100;
		private boolean state;
		private int currentVolume;
		private int currentChannel;
		public Television() {
			
		}
		public Television(boolean state,int currentVolume,int currentChannel) {
			this.state=state;
			this.currentVolume=currentVolume;
			this.currentChannel=currentChannel;
			}
		public boolean stateOfTv( ) {
			state= !state;
			return state;
			}
		public int increaseVolume() {
			if(currentVolume !=MAX) {
				this.currentVolume++;
			}
			return currentVolume;
		}
		public int decreaseVolume() {
			if(currentVolume !=MIN) {
				this.currentVolume--;
			}
			return currentVolume;
		}
		public int channelChange(int channelNo) {
			this.currentChannel=channelNo;
			return currentChannel;
		}

	}

