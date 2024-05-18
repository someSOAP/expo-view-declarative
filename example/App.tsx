import { ExpoViewDeclarativeView } from "expo-view-declarative";
import { Alert, StyleSheet, View } from "react-native";

export default function App() {
  return (
    <View style={styles.container}>
      <ExpoViewDeclarativeView
        style={{ flex: 1, width: "100%" }}
        btnText="Submit"
        onSubmit={(event) => {
          Alert.alert("NATIVE EVENT", event.nativeEvent.inputText);
        }}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
});
