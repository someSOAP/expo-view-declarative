import { StyleSheet, View } from 'react-native';

import { ExpoViewDeclarativeView } from 'expo-view-declarative';

export default function App() {
  return (
    <View style={styles.container}>
      <ExpoViewDeclarativeView
        style={{ flex: 1, width: '100%' }}
        btnText="Submit"
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
